// Assignment 4 source code

import java.math.*;

public class StackTest
{
  public static void main(String args [])
  {
    String accountName = "Account Name";
    String lastName = "Beach";
    String firstName = "Landon";
    String major = "Computer Science";
    String school = "SUU";
    String pin = "PIN";
    String className = "CSIS 2420";
    String classTime = "1:00pm-1:50pm";
    String grade = "A+";
    String computer = "Computer Name";

    Stack objStack = new Stack();
    System.out.println("Pushing 10 items only onto the stack");

    objStack.push(computer);
    objStack.push(grade);
    objStack.push(classTime);
    objStack.push(className);
    objStack.push(pin);
    objStack.push(school);
    objStack.push(major);
    objStack.push(firstName);
    objStack.push(lastName);
    objStack.push(accountName);

    System.out.println("Now popping each item of the stack...");

    while (!objStack.isEmpty())
    {
      System.out.println(objStack.pop());
      System.out.println();
    }
  }
}
