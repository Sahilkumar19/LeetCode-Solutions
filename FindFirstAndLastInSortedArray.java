import java.util.Arrays;

/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
 */
public class FindFirstAndLastInSortedArray {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int[] result=searchRange(nums,target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1 , -1};
        ans[0] = search(nums , target , true);
        ans[1] = search(nums, target , false);
        return ans;
    }
    public static int search(int[] nums, int target, boolean IsStarting) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            }else {
                // possible ans found
                ans = mid;
                if (IsStarting) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
