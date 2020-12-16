package com.sabal.scala.oop.lectures

object Objects {
  // SCALA DOES NOT HAVE CLASS LEVEL FUNCTIONALITY ("static")
  object Person { // type + only instance
    // static (class) - level functionality
    val N_EYES = 2
    def canFly: Boolean = false
    // factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobby")
  }

  class Person(val name: String) {
    // instance-level functionality
  }

  def main(args: Array[String]): Unit = {
    println(Person.N_EYES)
    println(Person.canFly)

    // Scala object = Singleton instance
    val person1 = Person
    val person2 = Person
    println(person1 == person2)

    val mary = new Person("Mary")
    val john = new Person("John")
    val bobby = Person(mary, john)
    println(mary == john)

    // Scala Applications = scala object with
    // def main(args: array[String]): Unit
  }



}
