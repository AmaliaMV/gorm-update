package example

class Person {

    String name

    Date lastUpdated

    Long version = 0L

    static constraints = {
        lastUpdated nullable: true, bindable: false
    }
}
