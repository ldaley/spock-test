import spock.lang.*
import grails.plugin.spock.*

class InCleanupSpecNoFeaturesSpec extends Specification {

	def cleanupSpec() {
		throw new Exception()
	}
}