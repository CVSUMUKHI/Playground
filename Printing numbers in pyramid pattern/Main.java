import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here Scanner sc=new Scanner(System.in);
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
         int count=n,i,k,num=1;
      /*for (k = 1; k <= n; k++)
        {
            for (i = 1; i <=n; i++)
                System.out.print(" ");
            //count--;
            for (i = 1; i <= 2 * k - 1; i++)
            {
              
                System.out.print(num);
                System.out.print(" ");
              num++;
            }
            System.out.println();
        }*/
      for( i = 1; i <= n; i++) {
        for (int s = 1; s <=n-i; s++)
                System.out.print(" ");

            for( int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                ++num;
            }

            System.out.println();
        }
    }    
}