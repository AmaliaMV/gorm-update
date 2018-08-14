package gorm.update

import example.Person

class BootStrap {

    def init = { servletContext ->

        Person.withNewSession {
            Person.withNewTransaction {
                Person person = Person.findByName('Tomy')

                if (!person) {
                    person = new Person(name: 'Tomy').save(flush: true)
                }
            }
        }

    }
    def destroy = {
    }
}
