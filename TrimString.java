/*Write a Java program to trim leading or trailing whitespace from a given string.
Sample Output:
Original String:  Java Exercises                                                                              
New String: Java Exercises */

public class TrimString {
    public static void main(String[] args)
    {
        String originalString = "   Java Exercises   ";
        System.out.println("Original String:" + originalString );
        String trimmedString = originalString.trim();
        System.out.println("New String:"+ trimmedString);
    }
}
