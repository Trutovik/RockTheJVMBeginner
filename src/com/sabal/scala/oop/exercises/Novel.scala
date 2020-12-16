package com.sabal.scala.oop.exercises

class Novel(name: String, yearOfRelease: Int, author: Writer) {
  def authorAge() = yearOfRelease - author.year

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYearOfRelease: Int): Novel = new Novel(name, newYearOfRelease, author)
}
