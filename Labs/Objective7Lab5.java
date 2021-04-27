import java.util.Scanner;

public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    /* inside of the endless loop, write if statements to
    determine if 1, 2, or 3 was selected */
      //if 1 was pressed, print Hello World
      //if 2 was pressed, print a String of my fave foods, Apple, Banana, Coconut
      //if 3 was pressed, break the loop
    while (true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      int selection = scanner.nextInt();

    if (selection == 1) {
      System.out.println("Hello Human");
    }
    if (selection == 2) {
      System.out.println("Apples, Bananas, Coconuts");
    }
    else if (selection == 3) {
      System.out.println("Goodbye human");
       break; /* we can break the loop with break; (within the else if paramaters)
            if we didn't have this break, the loop would never end and we
            could never reach our scanner.close(); statement */
    }
    }
    scanner.close();
  }
}
