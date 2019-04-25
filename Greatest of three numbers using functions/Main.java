import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
    int  r=change(n1,n2);
      if(r>n3)
        System.out.println(r);
      else
        System.out.println(n3);
	}
  public static int change(int n1,int n2)
  {
    if(n1>n2)
      return n1;
    else
      return n2;
  }
    
}