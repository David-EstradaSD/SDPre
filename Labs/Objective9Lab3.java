import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    //use while loop to print out the menu using "printMenu()" method
    // take a user's input, and print out correct message
    //refer to Objective7Lab5
    Scanner scanner = new Scanner(System.in);

    while (true) {
      printMenu();
      int selection = scanner.nextInt();
                  /* its crucial to itemize the user's input AFTER the menu and
                  before the if/else if cond. statements */
      if (selection == 1) {
        System.out.println("Hello Human");
      }
      if (selection == 2) {
        System.out.println("Apples, Bananas, Coconuts");
      }
      else if (selection == 3) {
        System.out.println("Goodbye human");
        break;
      }
    }
    scanner.close();
  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My Favorite Foods");
    System.out.println("3: Exit");
    System.out.println(); // do not forget this spacer line (for readability)
  }
}
