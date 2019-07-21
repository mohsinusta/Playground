import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      int second_digit = 0;
      while (number >= 100)
      {
        number = number / 10;
      }
      second_digit = number%10;
        System.out.println(second_digit);
	}
}