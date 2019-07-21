import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      System.out.print(sum_of_nat_num(n));
      
    }
  public static int sum_of_nat_num(int n)
  {
    if(n == 0)
    {
      return 0;
    }
    else if(n == 1)
    {
      return 1;
    }
    else
    {
     return n + sum_of_nat_num(n -1);
    } 
  }
}