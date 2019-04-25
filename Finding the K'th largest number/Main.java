import java.util.Scanner;
class Main 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int c=0,res=0;
    for(int i = 0; i < n; i++)
    {
      a[i] = sc.nextInt();
    }
    int  k= sc.nextInt();
    
    for(int i = 0; i < n-1; i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(a[i]>a[j])
           {
             int  tem=a[i];
             a[i]=a[j];
             a[j]=tem;
           }
           
      }
    }
   /* for(int i = 0; i < n; i++)
    {
     System.out.print(a[i]+" ");
    }
    System.out.println();*/
      System.out.println(a[n-k]);
    
  }
}