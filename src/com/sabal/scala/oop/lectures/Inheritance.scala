package com.sabal.scala.oop.lectures

object Inheritance extends App {

  // Single class inheritance
  class Animal {
    val creatureType = "wild"
    def eat() = {
      println("nomnom")
    }
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  // overriding
  class Dog(override val creatureType: String = "domestic") extends Animal {
    //override val creatureType: String = "domestic"
    override def eat(): Unit = println("crunch crunch")
  }

  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  // type substitution (broad: polymorphism)
  val unknownAnimal: Animal = new Dog("Bobik")
  unknownAnimal.eat

  // super

}
