package module1.homework

object LinearAlgebraOps{
  def sum(v1: Array[Int], v2: Array[Int]): Array[Int] = {
    if(v1.length != v2.length) {
      throw new Exception("Operation is not supported")
    } else {

      var result: Array[Int] = Array()

      for(el <- v1.indices) {
        result :+= v1(el) + v2(el)
      }

      result
    }
  }

  def scale(vector: Array[Int], scalar: Int): Array[Int] = {
    var result: Array[Int] = Array()
    for(el <- vector) {
      result :+= el * scalar
    }

    result
  }

  def axpy(a: Int, v1: Array[Int], v2: Array[Int]): Array[Int] = {
    if(v1.length != v2.length) {
      throw new Exception("Operation is not supported")
    } else {

      var result: Array[Int] = Array()

      for(el <- v1.indices) {
        result :+= a * v1(el) + v2(el)
      }

      result
    }
  }
}