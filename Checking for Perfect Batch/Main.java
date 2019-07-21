import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for(int index = 0; index < n; index++)
    {
      list[index] = in.nextInt();
    }
    perfect_batch(n, list);
  }
  public static void perfect_batch(int n, int list[])
  {
    boolean is_perfect = true;
    int batch_sum = (list[0] + list[1] + list[2]);
    for(int index = 3; index < (n - 1); index = index + 3)
    {
      int curr_batch = (list[index] + list[index + 1] + list [index + 2]);
      if(curr_batch != batch_sum)
      {
        is_perfect = false;
      }
    }
    if(is_perfect == true)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
    System.out.println("Not a Perfect Batch");
    }
  }
    
}