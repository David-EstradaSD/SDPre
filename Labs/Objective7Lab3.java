public class Objective7Lab3 {
  public static void main(String[] args) {
    //print out 1->20 while stating if its odd or even
      //write a while loop, using int counter
        //write an if statement that determines if odd or even (use %)
          //print out odd or even accordingly
        //increment the value of counter with each iteration
    int counter = 0;

      while(counter < 20) {
        counter = counter + 1;

      if (counter % 2 == 0) {
        System.out.println(counter + " is even");
      }
      else if (counter % 2 != 0) {
        System.out.println(counter + " is odd");
      }
    }
  }
}
