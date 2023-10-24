/*
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
Return the single element that appears only once.
Your solution must run in O(log n) time and O(1) space.



Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
 */
public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums={1,1,2,3,3,4,4,8,8};
        int ans=singleNonDuplicate(nums);
        System.out.println(ans);
    }
    public static int singleNonDuplicate(int[] nums) {
        int unique=0;
        for(int n:nums){
            unique^=n;
        }
        return unique;
    }
}
