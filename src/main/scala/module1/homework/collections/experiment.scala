package module1.homework.collections

import scala.util.Random
object experiment {
  def getRandomBall(bag: List[Int]): Boolean = {
    val firstBall: Int = Random.between(0, bag.size)
    val changedBag: List[Int] = bag diff List(firstBall)
    val secondBall = Random.between(0, changedBag.size)
    val selectedBalls: List[Int] = List(firstBall, secondBall)
    if(selectedBalls.contains(1)) {
      true
    } else {
      false
    }
  }

  def getProbability: Float = {
    val result: List[Boolean] = List.fill(10000)(Random.shuffle(List(1, 1, 1, 0, 0, 0))).map(getRandomBall)
    val filteredResult: Float = result.count(_ == true).toFloat / result.size.toFloat
    filteredResult
  }

}


