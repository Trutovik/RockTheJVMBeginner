package com.sabal.scala.oop.exercises

class Counter(val count: Int = 0) {

  def incr = {
    println("incrementing")
    new Counter(count + 1)
  }

  def decr = {
    println("decrementing")
    new Counter(count - 1)
  }

  def incr(amount: Int): Counter = {
    if (amount <= 0) this
    else incr.incr(amount - 1)
  }

  def decr(amount: Int): Counter = {
    if (amount <= 0) this
    else decr.decr(amount - 1)
  }

  def print = println(count)
}
