import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt();
      int arr[] = new int[arr_size];
      for(int index = 0; index < arr_size; index++)
      {
        arr[index] = sc.nextInt();
      }
      print_subset_of_3(arr_size, arr);
    }
  public static void print_subset_of_3(int arr_size, int arr[])
  {
    for(int index_1 = 0; index_1 < arr_size; index_1++)
    {
      for(int index_2 = index_1 + 1; index_2 < arr_size; index_2++)
      {
        for(int index_3 = index_2 + 1; index_3 < arr_size; index_3++)
        {
          System.out.print("(" + arr[index_1] + ", " + arr[index_2] + ", " + arr[index_3] + ")" + " ");
        }
      }
      if(index_1 == arr_size - 1)
      {
        break;
      }
      else
      {
        System.out.println();
      }
    }
  }
        
          
}