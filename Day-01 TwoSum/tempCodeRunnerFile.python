from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}
        for i, num in enumerate(nums):
            diff = target - num
            if diff in seen:
                return [seen[diff], i]
            seen[num] = i
        return []

# --- Test Cases ---

def run_test_cases():
    solution = Solution()

    # Test Case 1: Standard case with a solution
    nums1 = [2, 7, 11, 15]
    target1 = 9
    result1 = solution.twoSum(nums1, target1)
    print(f"Test Case 1:")
    print(f"  Input: nums = {nums1}, target = {target1}")
    print(f"  Expected Output: [0, 1]")
    print(f"  Actual Output: {result1}")
    print(f"  Result: {'Passed' if result1 == [0, 1] else 'Failed'}")
    print("-" * 20)

    # Test Case 2: Solution at the end of the list
    nums2 = [3, 2, 4]
    target2 = 6
    result2 = solution.twoSum(nums2, target2)
    print(f"Test Case 2:")
    print(f"  Input: nums = {nums2}, target = {target2}")
    print(f"  Expected Output: [1, 2]")
    print(f"  Actual Output: {result2}")
    print(f"  Result: {'Passed' if result2 == [1, 2] else 'Failed'}")
    print("-" * 20)

    # Test Case 3: No solution found
    nums3 = [1, 2, 3, 4]
    target3 = 10
    result3 = solution.twoSum(nums3, target3)
    print(f"Test Case 3:")
    print(f"  Input: nums = {nums3}, target = {target3}")
    print(f"  Expected Output: []")
    print(f"  Actual Output: {result3}")
    print(f"  Result: {'Passed' if result3 == [] else 'Failed'}")
    print("-" * 20)

    # Test Case 4: Duplicate numbers
    nums4 = [3, 3]
    target4 = 6
    result4 = solution.twoSum(nums4, target4)
    print(f"Test Case 4:")
    print(f"  Input: nums = {nums4}, target = {target4}")
    print(f"  Expected Output: [0, 1]")
    print(f"  Actual Output: {result4}")
    print(f"  Result: {'Passed' if result4 == [0, 1] else 'Failed'}")
    print("-" * 20)

# Run the test cases
run_test_cases()