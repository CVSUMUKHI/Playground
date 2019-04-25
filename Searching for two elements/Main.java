import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
       int key1=sc.nextInt();
       int key2=sc.nextInt();
      
      int i1=-1,i2=-1;
       for(int i=1;i<n;i++)
      {
       if(a[i]==key1)
         i1=i;
         if(a[i]==key2)
         i2=i;
         }
      System.out.println(i1);
      System.out.println(i2);
    }
}