import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    max(a,n);
  }
  public static void max(int a[],int n)
  {
    int loc=0,ele=a[0],i;
    for( i=1;i<n;i++)
    {
      if(a[i]>ele)
      {
        ele=a[i];
        loc=i;
      }
    }
      System.out.println(loc);
    }
}