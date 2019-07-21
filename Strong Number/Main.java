import java.util.Scanner;
class Main{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
     	int num = in.nextInt();	
     	int i,save_num,fact,rem;
     	int sum = 0; 	
     	int orig_num = num;
     	while(num != 0)
     	{
        	i =1;
        	fact = 1;
        	rem = num % 10;
        	while(i <= rem)
        	{
          	 	fact = fact * i;
           		i++;
        	}
        sum = sum + fact;
        num = num / 10;
     	}
     	if(sum == orig_num)
     	{
        	System.out.print("Yes");
     	}
     	else
     	{
        	System.out.print("No");
     	}	
    }
}