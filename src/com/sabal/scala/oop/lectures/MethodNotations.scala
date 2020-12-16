package com.sabal.scala.oop.lectures

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String) = new Person(s"${this.name} ($nickname)", favoriteMovie)
    def unary_!(): String = s"$name, what the heck?!"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
    def unary_+(): Person = new Person(name, favoriteMovie, age + 1)
    def learns(subject: String) = s"$name learns $subject"
    def learnsScala = learns("Scala")
    def apply(number: Int) = s"$name watched her favorite movie $favoriteMovie $number times"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")     // equivalent.
  // infix notation = operator notation (syntactic sugar)

  // "operators" in scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom))

  println(1 + 2)
  println(1.+(2))

  // ALL OPERATORS ARE METHODS

  // prefix notation
  val x = -1  // equivalent with 1.unary_-
  // unary_ prefix only works with few operators - + ~ !
  println(!mary)
  println(mary.unary_!)

  // postfix notitation (available only for the methods without parameters)
  println(mary.isAlive)
  println(mary isAlive)

  // special method name apply
  println(mary.apply)
  println(mary()) // equivalent

  println((mary + "the Rockstar")())
  println((+mary).age)

  println(mary learns "Java")
  println(mary learnsScala)

  println((mary + "bitch")(32))
}
