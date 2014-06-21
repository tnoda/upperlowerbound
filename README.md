upperlowerbound
===============

Scala's replacement for C++'s upper/lower_bound


Example
-----------------

    scala> import com.github.tnoda.upperlowerbound.BinarySearch._
    
    scala> val a = Array(1, 2, 3, 3, 3, 5, 8)
    a: Array[Int] = Array(1, 2, 3, 3, 3, 5, 8)
    
    scala> lowerBound(a, 0, a.length, 3)
    res2: Int = 2
    
    scala> upperBound(a, 0, a.length, 3)
    res3: Int = 5
