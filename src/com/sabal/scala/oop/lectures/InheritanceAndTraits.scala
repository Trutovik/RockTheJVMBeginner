package com.sabal.scala.oop.lectures

object InheritanceAndTraits extends App {

  // Single class inheritance
  class Animal {
    protected def eat() = {
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


}
