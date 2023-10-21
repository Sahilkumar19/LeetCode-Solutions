/*
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
 */
public class FindSmallestLetterGreaterThanTheTarget {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        char target='a';
        char ans=nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int s=0;
        int e=letters.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(letters[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return letters[s%letters.length];
    }
}
