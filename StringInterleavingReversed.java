/*Write a Java program to find all interleavings of given strings.
Sample Output:
The given strings are: WX  YZ                                                                                                               
The interleavings strings are: 
YWZX
WYZX
YWXZ
WXYZ
YZWX
WYXZ*/
 
 public class StringInterleavingReversed{
    public static void main(String[] args) {
        String str1 = "WX";
        String str2 = "YZ";
        System.out.println("The given strings are: " + str1 + " " + str2);
        System.out.println("The interleavings strings are: ");
        findInterleavings(str1, str2, "");
    }

    public static void findInterleavings(String str1, String str2, String result) {
        if (str1.length() == 0 && str2.length() == 0) {
            System.out.println(result);
            return;
        }

        if (str1.length() > 0) {
            findInterleavings(str1.substring(1), str2, result + str1.charAt(0));
        }
        if (str2.length() > 0) {
            findInterleavings(str1, str2.substring(1), result + str2.charAt(0));
        }
    }
}

