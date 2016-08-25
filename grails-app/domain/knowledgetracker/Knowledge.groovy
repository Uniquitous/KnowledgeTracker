package knowledgetracker

class Knowledge {
	String knownThing
	String details
	Date lastUpdated
	
	static hasMany = [Flag:flags]

    static constraints = {
    }
}
