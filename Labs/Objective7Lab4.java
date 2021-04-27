public class Objective7Lab4 {
  public static void main(String[] args) {
    //write program that sums up 1 thru 20
      //create 2 variables to store the current sum total and a counter
      //write a while loop
        //use count variable to have the loop execute 20x
        //increment value of count with each iteration
        //update current sum by adding count to sum with each iteration
    int sum = 0;
    int count = 0;

    while(count < 20) {
      count = count + 1;
      sum = sum + count;
    }
    /*so important to emphasize printing OUTSIDE the loop brackets so that
    we  don't have the sums continuously printout (1, 3, 6, 10...210) */
    System.out.println(sum);
  }
}
