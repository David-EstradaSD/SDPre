import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    int num = input.nextInt();
    if (num % 2 == 0) {
      /* Using (num % 2 == 0), we can find out if our variable
      "num" is even or not. (i.e. whether it's divisible by 2) */
      System.out.println("The number is even.");
    }
    else if (num % 2 != 0) {
      System.out.println("The number is odd.");
    }
    
    input.close();
  }
}
