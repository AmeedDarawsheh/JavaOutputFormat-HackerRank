import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String[] s1= new String[3];
            int x[]= new int[3];
      /// input
            for(int i=0;i<3;i++){
              s1[i]= sc.next();
              x[i]=sc.nextInt();
            }
      /// Output Format
            System.out.println("================================");
            for(int j=0;j<3;j++){
              System.out.printf("%-15s%03d\n",s1[j],x[j]);         
            }
            System.out.println("================================");
    }
}
