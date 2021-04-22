import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    // we want to make sure that word "keyboard" matches up with our variables

    System.out.println("Please enter the first whole number you would like to add.");
    int num1 = keyboard.nextInt();
    //notice how with int the function used is nextInt()
    System.out.println("Please enter the second whole number you would like to add.");
    int num2 = keyboard.nextInt();
    System.out.println("Please enter the third whole number you would like to add.");
    int num3 = keyboard.nextInt();
    System.out.println("Please enter the first decimal number you would like to add.");
    double dub1 = keyboard.nextDouble();
    System.out.println("Please enter the second decimal number you would like to add.");
    double dub2 = keyboard.nextDouble();
    System.out.println("Please enter the third decimal number you would like to add.");
    double dub3 = keyboard.nextDouble();
    int intsum = num1 + num2 + num3; //i created the variable identifier intsum
    double dubsum = dub1 + dub2 + dub3; //also created variable identifier dubsum
    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + intsum);
    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + dubsum);

  }
}
