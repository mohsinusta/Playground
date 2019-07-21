import java.util.Scanner;
class Main{
	public static void main (String[] args){
Scanner in = new Scanner(System.in);
      int n = in.nextInt();
        
       for(int row_no = 1; row_no <= n; row_no++)
      {
        //Handle all in number in row
        for(int col_no = 1; col_no <= n; col_no++)
        {
            //Condition to Print Numbers
          if(((row_no % 2 ==0) && (col_no == 1)) 
          || ((row_no % 2 == 1) && (col_no == n)))
          System.out.print(row_no + 1);
          else
          System.out.print(row_no);
        }
        System.out.print("\n");
      }	}
}