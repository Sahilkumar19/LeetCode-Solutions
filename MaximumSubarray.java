/*
Given an integer array nums, find the subarray
with the largest sum, and return its sum.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int ans=maxSubArray(nums);
        System.out.println(ans);

    }
    public static int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            max=Math.max(sum,max);

            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}

