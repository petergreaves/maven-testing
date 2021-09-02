import spock.lang.Specification

class GroovyHelloWorldSpec extends Specification {
    def "Hello"() {

        when:
        def foo="Hello Groovy World"

        then:
        true

    }
}
