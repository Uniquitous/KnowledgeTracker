package knowledgetracker

class Knowledge {
	String knownThing
	String details
	Date lastUpdated
	
	static hasMany = [flags:Flag]

    static constraints = {
    }
}
