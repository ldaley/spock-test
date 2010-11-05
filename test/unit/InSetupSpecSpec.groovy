import spock.lang.*
import grails.plugin.spock.*

class InSetupSpecSpec extends Specification {

	def setupSpec() {
		throw new Exception()
	}

	def t() {
		expect: 
		true
	}
	
}