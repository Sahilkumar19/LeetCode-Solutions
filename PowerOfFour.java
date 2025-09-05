/*
Given an integer n, return true if it is a power of four. Otherwise, return false.
An integer n is a power of four, if there exists an integer x such that n == 4x.

Example 1:

Input: n = 16
Output: true
 */
public class PowerOfFour {
    public static void main(String[] args) {
        int n=16;
        boolean ans=isPowerOfFour(n);
        System.out.println(ans);
    }
    public static boolean isPowerOfFour(int n) {
        if(n==0){
            return false;
        }
        int num=n;
        boolean ans=true;
        while (num>0){
            if(num==1){
                return true;
            }
            if (num%4==0){
                num=num/4;
            }
            else {
                return false;
            }
        }
        return false;
    }
}
