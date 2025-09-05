/*
Given an integer n, return true if it is a power of three. Otherwise, return false.
An integer n is a power of three, if there exists an integer x such that n == 3x.

Example 1:
Input: n = 27
Output: true
Explanation: 27 = 33
 */
public class PowerOfThree {
    public static void main(String[] args) {
        int n=27;
        boolean ans=isPowerOfThree(n);
        System.out.println(ans);
    }
    public static boolean isPowerOfThree(int n) {
        if(n==0){
            return false;
        }
        int num=n;
        boolean ans=true;
        while (num>0){
            if(num==1){
                return true;
            }
            if (num%3==0){
                num=num/3;
            }
            else {
                return false;
            }
        }
        return false;
    }
}
