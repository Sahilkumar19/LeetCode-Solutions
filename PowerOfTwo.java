/*
Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.

Example 1:
Input: n = 1
Output: true
Explanation: 20 = 1
 */

public class PowerOfTwo {
    public static void main(String[] args) {
        int n=14;
        boolean ans=isPowerOfTwo(n);
        System.out.println(ans);
    }
    public static boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        int num=n;
        boolean ans=true;
        while (num>0){
            if(num==1){
                return true;
            }
            if (num%2==0){
                num=num/2;
            }
            else {
                return false;
            }
        }
        return false;
    }
}
