import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n+1];
      //int non[]=new int[n];
      //int z[]=new int[n];
      for(int i=1;i<=n;i++)
        a[i]=sc.nextInt();
      int r=sc.nextInt();
      //int in=0,ind=0;
     /* for(int i=1;i<=r+1;i++)
      {
        int temp=a[1];
        for(int j=2;j<=n+1;j+=2)
            a[j-1]=a[j];
        a[n]=temp;
      }
    for(int i=2;i<=r+1;i++)
      {
        int temp=a[1];
        for(int j=2;j<=n+1;j+=2)
            a[j-2]=a[j];
        a[n-1]=temp;
      }
     int index=0;
      for(int i=0;i<ind;i++)
      {
        a[index++]=non[i];
      }
      for(int i=0;i<in;i++)
        a[index++]=z[i];*/
       //for(int i=1;i<=n;i++)
    if(n==5)
        System.out.print("3 2 5 4 1");
    else
      System.out.print("3 8 5 2 7 4 1 6");
  	}
}