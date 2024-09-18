/*Write a Java program to find the longest Palindromic Substring within a string.
Sample Output:
The given string is: thequickbrownfoxxofnworbquickthe
The longest palindrome substring in the given string is; brownfoxxofnworb
The length of the palindromic substring is: 16 */

public class LongestPalindromicSubstring 
{
    private static String expandAroundCenter(String str, int left, int right) 
    {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right))
         {
            left--;
            right++;
        }
        return str.substring(left + 1, right); 
    }
    public static String findLongestPalindromicSubstring(String str)
     {
        if (str == null || str.length() < 1) return "";
        String longestPalindrome = "";

        for (int i = 0; i < str.length(); i++) {
            String oddPalindrome = expandAroundCenter(str, i, i);
            String evenPalindrome = expandAroundCenter(str, i, i + 1);
            if (oddPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = oddPalindrome;
            }
            if (evenPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = evenPalindrome;
            }
        }
        return longestPalindrome;
    }

    public static void main(String[] args) 
    {
        String input = "thequickbrownfoxxofnworbquickthe";
        System.out.println("The given string is: " + input);
        String longestPalindrome = findLongestPalindromicSubstring(input);
        System.out.println("The longest palindrome substring in the given string is: " + longestPalindrome);
        System.out.println("The length of the palindromic substring is: " + longestPalindrome.length());
    }
}
