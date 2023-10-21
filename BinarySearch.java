/*
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int target=9;
        int ans=search(nums,target);
        System.out.println(ans);
    }
    public static int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] > target) {
                e = mid - 1;
            }else if(nums[mid]<target){
                s = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
