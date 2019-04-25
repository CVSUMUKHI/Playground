import java.util.Scanner;
class Main
{
  public static int sum_of_digits(int m)
   {
    int s=m*m;
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
/*import java.util.Scanner;
class Main
{
   public static int sum_of_digits(int m)
   {
      int remainder,sum = 0;
      while(m != 0)
      {
         remainder = m % 10;
         sum = sum + remainder;
         m = m / 10;
      }
      return sum;
   }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     while(n >= 10)
     {
        int sod = sum_of_digits(n);
        n = sod;
     } 
     System.out.println(n); //result printed here
   }
}*/
