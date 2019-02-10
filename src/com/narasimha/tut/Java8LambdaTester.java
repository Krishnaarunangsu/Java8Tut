/**
 * 
 */
package com.narasimha.tut;

/**
 * @author arunangsu.sahu
 *
 */
public class Java8LambdaTester {

  /**
   * 
   */
  public Java8LambdaTester() {
    // No-arg constructor
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    // lambda operations
    MathOperation addition = (int a, int b) -> a + b;
    MathOperation subtraction = (a, b) -> a - b;
    MathOperation multiplication = (int a, int b) -> {
      return a * b;
    };
    MathOperation division = (a, b) -> a / b;

    int x = 10;
    int y = 5;

    Java8LambdaTester java8LambdaTester = new Java8LambdaTester();
    System.out.println("10 + 5 =" + java8LambdaTester.operate(x, y, addition));
    System.out.println("10 - 5 =" + java8LambdaTester.operate(x, y, subtraction));
    System.out.println("10 * 5 =" + java8LambdaTester.operate(x, y, multiplication));
    System.out.println("10 / 5 =" + java8LambdaTester.operate(x, y, division));

    MathOperation addition1 = (int a, int b) -> a + b;
    System.out.println("In a different way \"10 + 5 =\"" + addition1.operation(x, y));
  }

  interface MathOperation {
    int operation(int a, int b);
  }

  /**
   * @param a
   * @param b
   * @param mathOperation
   * @return
   */
  private int operate(int a, int b, MathOperation mathOperation) {
    return mathOperation.operation(a, b);

  }

}
