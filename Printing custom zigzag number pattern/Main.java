import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,j;
     for(i=1;i<=n;i++)
    { 
        if (i%2==0){                 // if i is even 
        System.out.print(i+1);            // print i+1
        for(j=0;j<n-1;j++){            // then print i 4 times
       System.out.print(i);
           }
        }
       else{                        // case when i is odd
           for(j=0;j<n-1;j++){        // print i 4 times 
               System.out.print(i);
            }
                    System.out.print(i+1);         // at last print i+1
                        // at last print i+1
         }
       System.out.print("\n");
    }

    /*for( int i = 1 ; i <= dimension ; i++ )
    {
        for( int j = 1 ; j <= dimension ; j++ )
         System.out.println(i + (j == (1+((dimension-1)*(i%2))) )?  (i%2)*1 : 0);

        System.out.println( "\n");
    }*/

	}
}