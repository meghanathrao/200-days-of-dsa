from typing import List

class Solution:
    def rob(self, nums: List[int]) -> int:
        prev1, prev2 = 0, 0
        for num in nums:
            new_val = max(prev1, prev2 + num)
            prev2, prev1 = prev1, new_val
        return prev1

if __name__ == "__main__":
    solver = Solution()
    houses = [2, 7, 9, 3, 1]  
    max_loot = solver.rob(houses)
    print("Maximum loot possible:", max_loot)