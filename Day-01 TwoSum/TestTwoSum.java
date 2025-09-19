import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (seen.containsKey(diff)) {
                return new int[] { seen.get(diff), i };
            }
            seen.put(nums[i], i);
        }
        return new int[] {};
    }
}

public class TestTwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // --- Test Case 1 ---
        int[] nums1 = {2, 7, 11, 15,0};
        int target1 = 9;
        runTestCase(1, nums1, target1, new int[] {0, 1}, solution);

        // --- Test Case 2 ---
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        runTestCase(2, nums2, target2, new int[] {1, 2}, solution);

        // --- Test Case 3 ---
        int[] nums3 = {1, 2, 3, 4};
        int target3 = 10;
        runTestCase(3, nums3, target3, new int[] {}, solution);

        // --- Test Case 4 ---
        int[] nums4 = {3, 3};
        int target4 = 6;
        runTestCase(4, nums4, target4, new int[] {0, 1}, solution);
    }

    private static void runTestCase(int caseNum, int[] nums, int target, int[] expected, Solution solution) {
        int[] result = solution.twoSum(nums, target);
        System.out.println("Test Case " + caseNum + ":");
        System.out.println("  Input: nums = " + Arrays.toString(nums) + ", target = " + target);
        System.out.println("  Expected Output: " + Arrays.toString(expected));
        System.out.println("  Actual Output:   " + Arrays.toString(result));
        System.out.println("  Result: " + (Arrays.equals(result, expected) ? "Passed" : "Failed"));
        System.out.println("--------------------");
    }
}