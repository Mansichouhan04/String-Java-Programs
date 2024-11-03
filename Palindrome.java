//Check String is palindrome or not 
import java.util.Scanner;
public class Palindrome{
    public static void main(String args[]){
       int n,i,flag=0;
       String s;
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter the string");
       s=sc.nextLine();
       char str[]=s.toCharArray();
       n=str.length;
       for( i=0;i<n;i++){
          if(str[i]!=str[n-i-1]){
            flag=1;
            break;
          }
       }
       System.out.println("Is the string is palindrome");
       if(flag==0){
        System.out.println("yes");

       }
       else{
        System.out.println("no");
       }
    }
}