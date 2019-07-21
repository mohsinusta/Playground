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
      int value = sc.nextInt();
      all_pairs_of_elem(arr_size, arr, value);
    }
  public static void all_pairs_of_elem(int arr_size, int arr[], int value)
  {
    for(int index_1 = 0; index_1 < arr_size; index_1++)
    {
      for(int index_2 = index_1 + 1; index_2 < arr_size; index_2++)
      {
        int sum = arr[index_1] + arr[index_2];
        if(sum == value)
        {
          System.out.println(arr[index_1] + ", " + arr[index_2]);
        }
      }
      
    }
  }
}