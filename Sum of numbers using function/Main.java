import java.util.Scanner;
class Main{
  public static int sum_of_numbers(int m)
  {
    int sum = 0;
    for (int start = 1; start <= m; start++)
    {
      sum = sum + start;
    }
    return sum;
  }
	public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      num = sum_of_numbers(num);
      System.out.println(num);
      
	}
}