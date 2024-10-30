import java.util.*;
class ConvertUpperCase {
    public static void main(String args[]){
        String st;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string wich is converted into upper case");
        st=sc.nextLine();
        char str[]=st.toCharArray();
        System.out.println(str.length);
        for(i=0;i<str.length;i++){
            if(str[i]>='a'&&str[i]<='z'){
                str[i]=(char)((int)str[i]-32);
            }
        }
        System.out.println("Yhe string in uppercase");
        for(i=0;i<str.length;i++){
            System.out.print(" "+str[i]);
        }
    }
}