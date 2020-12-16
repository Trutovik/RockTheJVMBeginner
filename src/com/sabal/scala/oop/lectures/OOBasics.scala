package com.sabal.scala.oop.lectures

import com.sabal.scala.oop.exercises.{Counter, Novel, Writer}

object OOBasics extends App {
  val person = new Person("Alex", 37)
  println(person.age)
  person.greet("Donald")

  val author = new Writer("Aliaksandr", "Sabalevich", 1983)
  val imposter = new Writer("Aliaksandr", "Sabalevich", 1983)
  val novel = new Novel("Dead Lukashenko", 2020, author)
  println(author.fullName)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))
  println(novel.copy(2056).authorAge)

  val counter = new Counter
  counter.incr.print
  counter.incr.incr(6).print
}
