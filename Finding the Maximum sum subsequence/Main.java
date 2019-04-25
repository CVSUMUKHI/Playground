import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
     Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l[] = new int[n];
   //int pre=0;
    for(int i = 0; i < n; i++)
    {
      l[i] = sc.nextInt();
    }
    int r=l[0],m=l[0];
    
    for(int i = 1; i < n; i++)
    {
      if(l[i] > l[i-1])
        r+=l[i];
      else
      {
        r=l[i];
    }
      if(r>m)
        m=r;
    }
    
      System.out.print(m);
  }
}