package com.pduda.field

object LocalClient {
  def main(args: Array[String]): Unit = {
    val shoppingCart = new ShoppingCart
    shoppingCart.add(10)
    println("shoppingCart.numberOfProducts() = " + shoppingCart.numberOfProducts)
    println("shoppingCart.calculateTotalPrice() = " + shoppingCart.calculateTotalPrice)
    println("shoppingCart.hasDiscount() = " + shoppingCart.hasDiscount)
  }
}
