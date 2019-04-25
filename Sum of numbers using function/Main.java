
import java.util.Scanner;
class Main
{
  public static int sum_of_digits(int m)
   {
    int s;
    if(m==0)
      return 0;
    else
     s=m+sum_of_digits(m-1);
    return(s);
  }
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner in = new Scanner(System.in);
     int n = in.nextInt();
      int sod = sum_of_digits(n);
       System.out.println(sod);
	} 
}