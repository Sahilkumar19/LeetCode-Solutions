/*
A peak element is an element that is strictly greater than its neighbors.
Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
You must write an algorithm that runs in O(log n) time.

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
 */
public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        int ans=findPeakElement(nums);
        System.out.println(ans);
    }
    public static int findPeakElement(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(nums[mid]>nums[mid+1]){
                e=mid;
            }else{
                s=mid+1;
            }
        }
        return s;
    }
}
