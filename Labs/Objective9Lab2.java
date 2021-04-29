public class Objective9Lab2 {
  public static void main(String[] args) {
    //Objective: Print out "In method"
    System.out.println("In main"); // < step 1
    printMessage();                // < step 2
    System.out.println("In main"); // < step 3
  }
  public static void printMessage() {
    System.out.println("In method"); // < step 2.1
  }
}
/* the order of printouts will be: "In main", "In method", "In main"
    and that is bc the first thing JVM does is print "In main" (since thats
    our main method), then since we call the secondary method, it tells the
    JVM to do all steps in that method (print "In method"),before going back
    to main and finishing the next commands in main which is yet again,
    print "In main"  */
