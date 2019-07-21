import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      System.out.println(greatest_of_3_number(n1, n2, n3));
      
	}
  public static int greatest_of_3_number(int m, int n, int o)
  {
    int temp,greatest_number = 0;
    if(m > n)
    {
      temp = m;
    }
    else if(m < n)
    {
      temp = n;
    }
    else if (m > o)
    {
      temp = o;
    }
    else
    {
      temp = n;
    }
    greatest_number = temp;
    return greatest_number;
  }
}