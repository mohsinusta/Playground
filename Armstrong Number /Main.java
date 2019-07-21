import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int orig_num = num;
      int rem,sum = 0;

  while(num != 0)
  {
      rem = num % 10;
      sum = sum + (rem * rem * rem);
      num = num / 10;
  }

  if(sum == orig_num)
    System.out.println("Armstrong Number");
  else
   System.out.println("Not a Armstrong Number");

	}
}