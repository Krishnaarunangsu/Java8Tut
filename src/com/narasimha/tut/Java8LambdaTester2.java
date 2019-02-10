/**
 * 
 */
package com.narasimha.tut;

/**
 * @author arunangsu.sahu
 *
 */
public class Java8LambdaTester2 {

  /**
   * 
   */
  public Java8LambdaTester2() {
    // No-arg constructor
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    GreetingService greetingService1 = (message) -> System.out.println("Message is:" + message);
    GreetingService greetingService2 = (message) -> System.out.println("Message is:" + message);

    greetingService1.sayMessage("Krishna");
    greetingService1.sayMessage("Jagannath");

  }

  interface GreetingService {
    void sayMessage(String message);
  }

}
