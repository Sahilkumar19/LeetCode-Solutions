/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
 */
public class SqrtOfX {
    public static void main(String[] args) {
        int x=4;
        int ans=mySqrt(x);
        System.out.println(ans);
    }
    public static int mySqrt(int x) {
        return (int) Math.floor(Math.sqrt(x));
    }
}
