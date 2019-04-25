import java.util.Scanner;
class Main{
  public static int change(int m,int n)
	{
	    int s=1;
	    for(int i= 1; i<=n; i++)
	    {
	        s=s*m;
	    }
	    return s;
	}
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int b = in.nextInt();
	   int e = in.nextInt();
	   
	    int num=change(b,e);
	          System.out.println(num);
	      
	    
	}

	
}