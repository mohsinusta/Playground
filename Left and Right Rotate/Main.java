import java.util.Scanner;
class Main 
{
    public static void main(String [] args)
  {
    Scanner in = new Scanner(System.in);
    int arr_size = in.nextInt();
    int arr[] = new int[arr_size];
    for(int index = 0; index < arr_size; index++)
    {
      arr[index] = in.nextInt();
    }
    int no_of_rotation = in.nextInt();
    //function call
    rotate_right_odd(arr_size, arr, no_of_rotation);
    rotate_left_even(arr_size, arr, no_of_rotation);
    //Print the rotated array
    for(int index = 0; index < arr_size; index++)
    {
      System.out.print(arr[index] + " ");
    }
  }
  public static void rotate_left_even(int arr_size, int arr[], int no_of_rotation)
  {
    int first_even_elem_idx = 1;
    int last_even_elem_idx;
    if(arr_size % 2 == 0)
    {
      last_even_elem_idx = arr_size - 1;
    }
    else
    {
      last_even_elem_idx = arr_size - 2;
    }
    for(int rotation = 1; rotation <= no_of_rotation; rotation++)
    {
      int temp = arr[first_even_elem_idx];
      for(int idx = 3; idx < arr_size; idx = idx + 2)
      {
        arr[idx - 2] = arr[idx];
      }
      arr[last_even_elem_idx] = temp;
    }
  }
  public static void rotate_right_odd(int arr_size, int arr[], int no_of_rotation)
  {
    int first_odd_elem_idx = 0;
    int last_odd_elem_idx;
    if(arr_size % 2 == 1)
    {
      last_odd_elem_idx = arr_size - 1;
    }
    else
    {
      last_odd_elem_idx = arr_size - 2;
    }
    for(int rotation = 1; rotation <= no_of_rotation; rotation++)
    {
      int temp = arr[last_odd_elem_idx];
      for(int idx = (last_odd_elem_idx - 2) ; idx >= 0; idx = idx - 2)
      {
        arr[idx + 2] = arr[idx];
      }
      arr[first_odd_elem_idx] = temp;
    }
  }

}