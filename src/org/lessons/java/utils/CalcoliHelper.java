package org.lessons.java.utils;

public class CalcoliHelper {
  public int number;

  // somma di numeri interi
  public static int somma(int number1, int number2) {
    return number1 + number2;
  }

  // somma di numeri double
  public static double sommaDouble(double number1, double number2) {
    return number1 + number2;
  }

  // differnza tra interi
  public static int diffInteri(int number1, int number2) {
    return Math.absExact(number1 - number2);
  }

  // multiplicazione di 2 numeri

  public static int multi(int number1, int number2) {
    return number1 * number2;
  }

  // multiplicazione di 2 numeri

  public static int abstractValue(int number1, int number2) {
    return Math.abs(number2);
  }
}
