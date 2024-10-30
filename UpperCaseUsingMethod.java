import java.util.*;
class UpperCaseUsingMethod {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to be converted to uppercase");
        String str=sc.nextLine();

        str=str.toUpperCase();
        System.out.println("String on using toUpperCase()method"+" "sushil+str);
    }
}