import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      StringBuffer sb=new StringBuffer(str);
      int l=sb.length();
      int j=l-1,flag=1;
      for(int i=0;i<l;i++)
      {
        if(sb.charAt(i)!=sb.charAt(j))
        {
          flag=0;
          break;
        }
        j--;
      }
      
      if(flag==1)
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}

