import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String sub=sc.nextLine();
      StringBuffer sb=new StringBuffer(str);
     StringBuffer suub=new StringBuffer(sub);
      int l=sb.length();
      int l1=suub.length();
      int c=0;
      for(int i=0;i<(l-l1)+1;i++)
      {
        for(int j=0;j<l1;j++)
        {
          if(str.charAt(i+j)==sub.charAt(j))
          {
            c++;
          }
        }
      }
      




int count=c/l1;

      
      //if(flag==1)
        System.out.println(count);
    }
}