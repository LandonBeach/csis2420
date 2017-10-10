// Assignment 2 source code
import java.util.Scanner;

public class randomArray
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    int n = 0;
    int max = 1000;

    do
    {
      System.out.print("Please enter the max range: ");
      max = input.nextInt();
      if(max < 0)
      {
        System.out.println("Invalid input. Please enter a number greater than 0.");
      }
    } while(max < 0);

    do
    {
      System.out.print("Please enter how many random numbers: ");
      n = input.nextInt();
      if(n < 0)
      {
        System.out.println("Invalid input. Please enter a number greater than 0.");
      }
    } while(n < 0);

    int [] array = new int [n];

    for(int i = 0; i < n; i++)
    {
      array[i] = (int)Math.floor(Math.random()*max)+1;
    }

    for(int i = 0; i < n; i++)
    {
      System.out.println((i+1) +". "+ array[i]);
    }
  }
}
