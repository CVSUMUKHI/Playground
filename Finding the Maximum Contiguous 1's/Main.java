import java.util.Scanner;
class Main 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l[] = new int[n];
    int c=0,res=0;
    for(int i = 0; i < n; i++)
    {
      l[i] = sc.nextInt();
    }
    
    for(int i = 0; i < n; i++)
    {
      if(l[i]==0)
        c=0;
      else
      {
        c++;
      res=c>res?c:res;
    }
    }
    
      System.out.print(res);
    
  }
}
   