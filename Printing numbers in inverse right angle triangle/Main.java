import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
         int count=n,i,k;
      for (k = n; k >= 1; k--)
        {
        int num=k;    
            for (i = 1; i <= k; i++)
            {
                System.out.print(num);
              num--;
            }
            System.out.println();
        }
	}
}