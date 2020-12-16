package com.sabal.scala.oop.lectures

class Person(name: String, val age: Int) {
  val x: Int = 2
  println(x + 3)

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name!")

  def greet(): Unit = println(s"Hi, I am $name")
}