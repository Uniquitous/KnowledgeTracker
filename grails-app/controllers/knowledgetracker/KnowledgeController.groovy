package knowledgetracker

class KnowledgeController {

    def index() { }
    
    def addFlagToKnowledge = {
    	def flagText = params.flag
    	def existingFlag = Flag.findByTag(flagText)
    	if(!existingFlag) {
    		existingFlag = new Flag(tag:flagText)
    	}
    	def knowledge = Knowledge.get(params.knowId)
    	if(!knowledge){
    		throw new RuntimeException('We have no such knowledge')
    	} else {
    		knowledge.addToFlags(existingFlag)
    	}
    	redirect(view: 'show', id:knowId)
    }
}
