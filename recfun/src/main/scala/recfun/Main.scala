package recfun

import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int =
      if (c == 0 || c == r) 1
      else pascal(c, r-1) + pascal(c-1, r-1)
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      @tailrec
      def loop(chars: List[Char], accum: Int): Boolean = {
        chars match {
          case Nil => accum == 0
          case '(' :: xs => loop(xs, accum+1)
          case ')' :: xs => if (accum > 0) loop(xs, accum-1) else false
          case _ :: xs => loop(xs, accum)
        }
      }
      loop(chars, 0)
    }

  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if (money == 0) 1
      else if (money < 0 || coins.isEmpty) 0
      else countChange(money - coins.head, coins) + countChange(money, coins.tail)
    }
}
