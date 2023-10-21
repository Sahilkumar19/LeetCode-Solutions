/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=5;
        int ans=searchInsert(nums,target);
        System.out.println(ans);
    }
    public static int searchInsert(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>target){
                e=mid-1;
            }else if(nums[mid]<target){
                s=mid+1;
            }else{
                return mid;
            }
        }
        return s;
    }
}
