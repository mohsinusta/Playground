import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	   Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      System.out.println(gcd_of_3_number(n1, n2, n3));
      
	}
  public static int gcd_of_3_number(int m, int n, int o)
  {
    int min, gcd = 1;
    if(m > n)
    {
      min = n;
    }
    else if(m < n)
    {
      min = m;
    }
    else if (m > o)
    {
      min = o;
    }
    else
    {
      min = o;
    }
    for(int i = 1; i != min; i++)
    {
      if(((m % min == 0) && (n % min == 0)) && (o % min == 0))
      {
        gcd = min;
        break;
      }
      min--;
    }
    return gcd;
  }
      
  
	
}