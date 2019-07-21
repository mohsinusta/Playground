import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int factorial = 1;
      for (int fact = 1; fact <= num; ++fact)
      {
        factorial = factorial * fact;
      }
      System.out.println(factorial);
	}
}