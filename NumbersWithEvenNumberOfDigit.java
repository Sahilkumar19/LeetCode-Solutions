/*
Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
 */
public class NumbersWithEvenNumberOfDigit {
    public static void main(String[] args) {
        int[] nums={12,354,2,6,7896};
        int ans=findNumbers(nums);
        System.out.println(ans);

    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            int count2=0;
            if(nums[i]>=10){

                while(nums[i]>0){
                    count2++;
                    nums[i]=nums[i]/10;
                }
            }
            if(count2>0 && count2%2==0){
                count++;
            }
        }
        return count;
    }
}
