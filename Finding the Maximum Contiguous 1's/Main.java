import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int i = 0; i < arr_size; i++)
      {
        arr[i] = in.nextInt();
      }
      int count = 0;
      for(int idx = 0; idx < arr_size; idx++)
      {
        if(arr[idx] != 0)
        {
          count++;
        }
        else
        {
          break;
        }
      }
      System.out.print(count);
    }
}