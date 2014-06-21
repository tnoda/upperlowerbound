package com.github.tnoda.uppwerlowerbound

import scala.annotation.tailrec

object BinarySearch {

  // lowerBound is a version of binery search: it attempts to find the
  // element value in an sorted range [first, last). Specifically, it
  // returns the first position where value could be inserted without
  // violating the ordering.
  def lowerBound[T](sorted: IndexedSeq[T], first: Int, last: Int, value: T)
                (implicit ev: Ordering[T]): Int = {

    @tailrec
    def binarySearch(a: Int, b: Int): Int = {
      if (b - a <= 1) b
      else {
        val m = (a + b) / 2
        if (ev.lt(sorted(m), value)) binarySearch(m, b)
        else binarySearch(a, m)
      }
    }

    binarySearch(first - 1, last)
  }

  // upperBound is a version of binery search: it attempts to find the
  // element value in an sorted range [first, last). Specifically, it
  // returns tha last position where value could be inserted without
  // violating the ordering.
  def upperBound[T](sorted: IndexedSeq[T], first: Int, last: Int, value: T)
        (implicit ev: Ordering[T]): Int = {

    @tailrec
    def binarySearch(a: Int, b: Int): Int = {
      if (b - a <= 1) b
      else {
        val m = (a + b) / 2
        if (ev.lteq(sorted(m), value)) binarySearch(m, b)
        else binarySearch(a, m)
      }
    }

    binarySearch(first - 1, last)
  }
}
