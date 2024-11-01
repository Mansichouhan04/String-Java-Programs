//convert uppercase to lower case
import java.util.*;
class ConvertupperToLower {
    public static void main(String args[]){
        String st;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string which is converted to lower case");
        st=sc.nextLine();
        char str[]=st.toCharArray();
        for(i=0;i<str.length;i++){
            if(str[i]>='A'&&str[i]<='Z'){
                str[i]=(char)((int)str[i]+32);
            }
        }
        System.out.println("The string in lowerCase is");
        for(i=0;i<str.length;i++)
        System.out.print(str[i]);
    }
}