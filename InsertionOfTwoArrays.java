/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
 */
import java.util.*;
public class InsertionOfTwoArrays {
    public static void main(String[] args) {
        int[] num1={1,2,2,1};
        int[] num2={2,2};
        int[] result=intersection(num1,num2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (i > 0 && nums1[i] == nums1[i - 1]) {
                continue; // Skip duplicates in nums1
            }

            for (int j = 0; j < nums2.length; j++) {
                if ((nums1[i] ^ nums2[j]) == 0) {
                    set.add(nums1[i]);
                    break; // Found intersection, move to the next element in nums1
                }
            }
        }

        resultList.addAll(set);

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
