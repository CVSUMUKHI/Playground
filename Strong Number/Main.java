/*import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int fact=1;
      int org=n;
      int sum=0;
      int temp=n;
      int remainder;
      while (temp != 0) {
         remainder = temp%10;
         
         
      for(int i=1;i<=remainder;i++)
      {
        fact=fact*i;
          sum=sum+fact;
      }
        temp = temp/10;
      
	
	}
      if(sum==n)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}*/
import java.util.Scanner;

public class Main{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Number, Temp, Reminder, Sum = 0, i, Factorial;
		sc = new Scanner(System.in);
		Number = sc.nextInt();		
		
		Temp = Number;
		while( Temp > 0)
		{
			Factorial = 1; 
			i = 1; 
		    Reminder = Temp % 10;
		    while (i <= Reminder)
		    {
		     	Factorial = Factorial * i;
		     	i++;
		    }
		    
		     Sum = Sum + Factorial;
		     Temp = Temp /10;
		}
		
		
		
		if ( Number == Sum )
		{
			System.out.println("Yes");
		}
		else
		{
		   System.out.println("No");
		}
	}
}
