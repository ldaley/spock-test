import spock.lang.*
import grails.plugin.spock.*

class InSetupSpecNoFeaturesSpec extends Specification {

	def setupSpec() {
		throw new Exception()
	}

}