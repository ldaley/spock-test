import spock.lang.*
import grails.plugin.spock.*

class InSetupSpecAndCleanupSpecSpec extends Specification {

	def setupSpec() {
		throw new Exception()
	}

	def t() {
		expect: 
		true
	}

	def cleanupSpec() {
		throw new Exception()
	}

}