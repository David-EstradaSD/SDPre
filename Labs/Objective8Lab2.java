public class Objective8Lab2 {
  public static void main(String[] args) {
    //Write a program that sums up the numbers 1 thru 20 using for loop
      //create one variable to store current sum total
      //write a for loop
    int sum = 0;
    for (int i = 1; i <= 20; i ++) {
      sum = i + sum;   //updated the current sum
                      //(by adding control var. to sum each iteration)
    }
      System.out.println(sum);
      //super important to print the total sum outside the loop body
  }
}
