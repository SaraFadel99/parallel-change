package com.pduda.field

object LocalClient {
  def main(args: Array[String]): Unit = {
    val shoppingCart = new ShoppingCart
    shoppingCart.add(10)
    System.out.println("shoppingCart.numberOfProducts() = " + shoppingCart.numberOfProducts)
    System.out.println("shoppingCart.calculateTotalPrice() = " + shoppingCart.calculateTotalPrice)
    System.out.println("shoppingCart.hasDiscount() = " + shoppingCart.hasDiscount)
  }
}
