import spock.lang.*
import grails.plugin.spock.*

class InSetupSpecAndCleanupSpecNoFeaturesSpec extends Specification {

	def setupSpec() {
		throw new Exception()
	}

  def t() {
    expect: 
    false
  }

	def cleanupSpec() {
		throw new Exception()
	}

}