import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      int sum = 0;
      while (number >= 10)
      {
        sum = sum + number%10;
        number = number / 10;
        if(number > 0 && number < 10)
        {
          sum = sum + number%10;
        }
      }
      System.out.println(sum);
	}
}