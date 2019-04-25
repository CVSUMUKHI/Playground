import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int sum=0,dup=0,rep=0;
      for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
     // for(int i=0;i<n;i++)
       // sum=sum+a[i];
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
        if((a[i]==a[j])&&(i!=j))
        
        {
          dup=1;
          if(i<j)
            rep=1;
          break;
        }
        }
        if((dup==1)&&(rep==1))
        {
          //System.out.println(a[i]);
          //System.out.println(i);
          a[i]=0;
         dup=0;
          rep=0;
        }
        
        }
        sum=(n*(n+1))/2;
     for(int i=0;i<n;i++)
       sum=sum-a[i];
      System.out.println(sum);
      
    }
}