/*Write a Java program to convert all characters in a string to uppercase.
 Sample Output:
Original String: The Quick BroWn FoX!                                                                         
String in uppercase: THE QUICK BROWN FOX!*/

 public class StringToUppercase {
    public static void main(String[] args) {
        String originalString = "The Quick BroWn FoX!";
        String upperCaseString = originalString.toUpperCase();
        System.out.println("Original String: " + originalString);
        System.out.println("String in uppercase: " + upperCaseString);
    }
}

