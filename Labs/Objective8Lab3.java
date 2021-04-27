public class Objective8Lab3 {
  public static  void main(String[] args) {
    // Print out 1-20, while also stating if the number is odd or even
    // Use a for loop
    for (int counter = 1; counter <= 20; counter ++) {

    if (counter % 2 == 0) {
      System.out.println(counter + " is even");
    }
    else if (counter % 2 != 0) {
      System.out.println(counter + " is odd");
    }
    }
  }
}
