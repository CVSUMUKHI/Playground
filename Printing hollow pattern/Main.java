import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    
    Scanner sc= new Scanner(System.in);
      int number=sc.nextInt();
 
       /* for (int i = 0; i <= number; i++) {
            if (i == 0 || i == number) {
                for (int j = 0; j < number; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            if (i >= 1 && i < number) 
            {
                for (int j = 0; j <=number; j++) 
                {
                    if (j == 0 || j == 5) {
                        System.out.print("*");
                    } else if (j >= 1 && j <5) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }*/
      for (int i = 1; i <= number; i++)
      {
    
      for (int j = 1; j <= number; j++) 
      {
        if(i==1||j==1||i==number||j==number)
           System.out.print("*");
        else
        System.out.print(" ");
      }
       System.out.println();
      }
    }
}
 
	