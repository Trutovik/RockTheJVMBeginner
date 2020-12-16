package com.sabal.scala.oop.lectures

object AbstractDataTypes extends App {

  // abstract members
  abstract class Animal {
    val creatureType: String = "wild"
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    override def eat: Unit = println("Chase, catch and kill")
  }

  // traits
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "Fresh meat"
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"

    override def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")

    override def eat: Unit = println("nomnomnom")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  // traits vs abstract classes
  // 1. Traits cannot have constructor parameters
  // 2. You can only extends one class, but multiple traits may be inherited
  // 3. Choose a trait if it describes a type of behavior while abstract class describes an entity
}
