package simpleclass

class Person {
    var firstName: String? = null
    var secondName: String? = null
    var age: Int? = null


    constructor(firstName: String, secondName: String, Age: Int) {
        this.firstName = firstName
        this.secondName = secondName
        this.age = age
    }

    constructor(firstname: String, secondName: String) {
        this.firstName = firstName
        this.secondName = secondName
    }

    constructor(age: Int) {
        this.age = age
    }
}