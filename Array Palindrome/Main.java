import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int sum=0,left=0,right=n-1;
      for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
     // for(int i=0;i<n;i++)
       // sum=sum+a[i];
      while(left<right)
      {
       // for(int j=n-1;j>=0;j--)
        {
        if((a[left]==a[right]))
        {
          left++;
          right--;
        }
          else
          {
          sum=1;
          break;
        }
        
    }
}
      if(sum==0)
        System.out.println("Yes");
      else
         System.out.println("No");
    }
}