import java.util.Scanner;
class Main{
 
 public static void main(String[] args) 
  { 
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = str1+str1;
        StringBuilder sb1 = new StringBuilder(str3);
        StringBuilder sb2 = new StringBuilder(str2);
       
       
        int sb1_len = sb1.length();
        int sb2_len = sb2.length();
        
   		int i, j,loc=-1;
        for(i = 0; i < (sb1_len -sb2_len + 1); i++)
        {
            boolean is_matching = true;
            for(j = 0; j < sb2_len; j++)
            {
                if(sb1.charAt(i + j) != sb2.charAt(j))
                {
                    is_matching = false;
                }
            }
            if(is_matching == true)
            {
             loc=i;
              break; 
            }
        }
        if(loc!=-1)
        System.out.print("Yes");
   else
        System.out.print("No");
    }
}