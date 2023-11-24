/*
The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.
For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer num, return its complement.

Example 1:
Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
 */
public class NumbersComplement {
    public static void main(String[] args) {
        System.out.println(FindComplement(5));
    }
    public static int FindComplement(int num){
        // Find the number of bits needed to represent the positive integer
        int bitCount = 0;
        int temp = num;
        while (temp > 0) {
            bitCount++;
            temp >>= 1; // Right shift to remove the least significant bit
        }

        // Create a bitmask with all bits set to 1 up to the significant bits of the original number
        int bitmask = (1 << bitCount) - 1;

        // XOR the original number with the bitmask to get the complement
        int complement = num ^ bitmask;

        return complement;
    }
}