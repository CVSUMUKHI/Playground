import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   
      Scanner sc=new Scanner(System.in);
      int n =sc.nextInt();
      int n1=0;
      int s=0;
      while(n!=0)
      {
        n1=n%10;
        s=s+n1;
        n=n/10;
	}
      System.out.println(s);
    }
}