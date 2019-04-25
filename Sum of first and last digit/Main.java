import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int n =sc.nextInt();
    
      int n2=n%10;
      int n1=n;
     
      while (n1 >= 10)  
        n1 /= 10; 
      System.out.println(n1+n2);
	}
}