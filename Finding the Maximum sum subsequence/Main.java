import java.util.Scanner;
class Main
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
    int seq[] = new int[2*arr_size];
    int seq_idx = 0;
    int start_idx = 0;
    for(int index = 0; index < arr_size - 1; index++)
    {
      if(arr[index] > arr[index + 1])
      {
        seq[seq_idx] = start_idx;
        seq_idx++;
        seq[seq_idx] = index;
        seq_idx++;
        start_idx = index + 1;
      }
    }
     if(start_idx != arr_size - 1)
    {
      seq[seq_idx] = start_idx;
      seq_idx++;
      seq[seq_idx] = arr_size - 1;
      seq_idx++;
    }
    if(start_idx == arr_size - 1)
    {
      seq[seq_idx] = start_idx;
      seq_idx++;
      seq[seq_idx] = arr_size - 1;
      seq_idx++;
    }
    int max_sum = 0, sum = 0;
    for(int idx = 0; idx <= seq_idx - 1; idx = idx +2)
    {
      start_idx = seq[idx];
      int end_idx = seq[idx + 1];
      
      for(int index = start_idx; index <= end_idx; index++)
      {
        sum = sum + arr[index];
        
        //System.out.print(arr[index] + " ");
      }
      if(max_sum < sum)
      {
        max_sum = sum;
        sum = 0 ;
      }
      
      //System.out.println();
    }
    System.out.print(max_sum);
    }
}