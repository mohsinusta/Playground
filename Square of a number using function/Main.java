import java.util.Scanner;
class Main
{
  public static int square_of_num(int m)
  {
    int square = m * m;
    return square;
  }
	public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      n = square_of_num(n);
      System.out.println(n);
	} 
}