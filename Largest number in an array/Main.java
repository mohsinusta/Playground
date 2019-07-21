import java.util.Scanner;
class Main{
    public static void main(String args[]){
         Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr_size[] = new int[n];
      for(int i = 0; i < n; i++)
      {
        arr_size[i] = in.nextInt();
      }
      int largest_num = arr_size[0];
      for(int i = 0; i < n; i++)
      {
        if (arr_size[i] > largest_num)
        {
          largest_num = arr_size[i];
        }
      }
      System.out.println(largest_num);
        
          
    }
}