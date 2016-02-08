import groovy.json.JsonSlurper

def slurper = new JsonSlurper()
def result = slurper.parseText('{"person":{"name":"Guillaume","age":33,"pets":["dog","cat"]}}')
result

// JSON slurper
import groovy.json.JsonSlurper

def slurper = new JsonSlurper()
def result = slurper.parseText('{"person":{"name":"Guillaume","age":33,"pets":["dog","cat"]}}')
result.person.name + " " + result.person.age

(0..20).grep((19..21))

// Specifying Ranges
assert (0..100).contains(100)
assert ('a'..'c').contains('b')

("a".."c").contains("b")


("a".."z")

def today = new Date();
def fivedaysback = today - 5
println fivedaysback

for (element in "z".."a") {
    print element
}
// range each element closure
(10..<5).each { element -> println element }

// convert the object to JSON
// def class
import groovy.json.*

class Person {
    String name
    String email
    String address
    String phone

    Person(String name) {
        this.name = name
    }

    Person(String name, String email) {
        this.name = name
        this.email = email
    }

    @Override
    String toString() {
        return super.toString()
    }
}

def people = [] as List
(1..10).each {
    people.add(new Person("PK-" + it))
}
// convert a object to JSON
println new JsonBuilder(people).toPrettyString()

//Iterating a list
// 1 to 3
println ""
println " This list inside a list"
println "Iterating [1..3, 2..3]"
[1..3, 2..3].each {
    print it
}

//Iterating a range
// 1 to four
println ""
println "Iterating a range (1..4)"
(1..4).each {
    print it
}