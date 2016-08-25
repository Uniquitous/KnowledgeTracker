package knowledgetracker

class Flag {
	String tag

    static constraints = {
    	tag(unique:true)
    }
}
