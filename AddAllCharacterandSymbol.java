import java.util.*;
public class AddAllCharacterandSymbol {
    public static void main(String args[]){
        int i,vowels=0,consonants=0,digits=0,spaces=0,specialcharacters=0;
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence");
        s=sc.nextLine();
        char str[]=s.toCharArray();
        int n=str.length;
        for(i=0;i<n;i++){
          if(str[i]=='a'||str[i]=='e'||str[i]=='o'||str[i]=='u'){
              vowels++;
          }
          else if((str[i]>='a'&&str[i]<='z')||str[i]>='A'&&str[i]<='Z'){
            consonants++;
          }
          else if(str[i]>='0'&&str[i]<='9'){
            digits++;
          }
          else if(str[i]==' '){
            spaces++;
          }
          else{
             // int specialcharacters = 0;
            specialcharacters++;
          }
        }
        System.out.println("vowels"+vowels);
        System.out.println("consonants"+consonants);
        System.out.println("Digits"+digits);
        System.out.println("white spaces"+spaces);
        System.out.println("specialCharacters"+specialcharacters);
    }
}