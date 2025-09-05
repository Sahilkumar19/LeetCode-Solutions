/*
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
 */
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        reverseString(s);
//        System.out.println(reverseString(s));
    }
    public static void reverseString(char[] s) {
        int length = s.length;
        for (int i = 0 , j = length-1 ; i < length/2  ; i++ , j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        System.out.println(Arrays.toString(s));
    }

}
