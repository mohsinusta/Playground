import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = 3;
    for (int i = 1; i <= n; i++)
    {
      System.out.print(i);
      if(i % 3 == 0)
        System.out.print(",");
    }
  }
}