import spock.lang.*
import grails.plugin.spock.*

class InCleanupSpecSpec extends Specification {

	def cleanupSpec() {
		throw new Exception()
	}

	def t() {
		expect: 
		true
	}
}