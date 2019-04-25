import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
      int count=0;
		for(int num = 1 ; num <= n ; num++) {
			System.out.print(num);
          count++;
			if((num != n)&&(count%3==0))
    			System.out.print(",");			
		}
    }
 }