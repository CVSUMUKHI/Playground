import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
         int count=n,i,k;
      for (k = 1; k <= n; k++)
        {
            for (i = 1; i < count; i++)
                System.out.print(" ");
            count--;
            for (i = 1; i <= 2 * k - 1; i++)
                System.out.print("*");
            System.out.println();
        }
	}
}