/**
 * 
 */
package com.narasimha.tut;

/**
 * @author arunangsu.sahu
 *
 */
interface IFunctInt {
  int func(int num1, int num2);
}


public class LambdaExceptionlDemo {

  /**
   * 
   */
  public LambdaExceptionlDemo() {
    // No-arg Constructor
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    // Lambda scope check
    int i;
    IFunctInt ifunc1 = (num1, num2) -> {
      // int i;
      return num1 - num2;

    };

  }

}
