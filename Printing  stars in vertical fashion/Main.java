import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
	Scanner in = new Scanner(System.in);
    int line = in.nextInt();
    int line_count;
    for (line_count = 1; line_count <= line; line_count++)
    {
      System.out.println("*");
    }
  }
}