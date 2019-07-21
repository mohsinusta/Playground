import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int number = in.nextInt();
	   for (int factors = 1; factors <= number; ++factors)
	   {
	       if(number % factors == 0)
	       System.out.println(factors);
	   }
	}
}