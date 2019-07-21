import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr_size[] = new int[n];
      for(int i = 0; i < n; i++)
      {
        arr_size[i] = in.nextInt();
      }
      int search_elem_1 = in.nextInt();
      int search_elem_2 = in.nextInt();
      int is_found = 0;
      int index1 = -1, index2 = -1;
      for(int i = 0; i < n; i++)
      {
        if(search_elem_1 == arr_size[i])
        { 
          index1 = i;
        }
        else if(search_elem_2 == arr_size[i])
        {
          index2 = i;
        }
      }
      System.out.println(index1);
      System.out.println(index2);
    
          
          
      
         
    }
}