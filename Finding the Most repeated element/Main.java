import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
   //int pre=0;
    int b[] = new int[n];
    for(int i = 0; i < n; i++)
    {
      a[i] = sc.nextInt();
    }
    int c=1,m=1,r=a[0];
    
    for(int i = 1; i < n; i++)
    {
      //for(int j = 0; j < n; j++)
     
      if(a[i] == a[i-1])
        c++;
     else
     {
       if(c>m)
       {
         m=c;
         r=a[i-1];
       }
       c=1;
     }
       
    }
    if(c>m)
    {
      m=c;
      r=a[n-1];
    }
    
      System.out.print(r);
  }
}