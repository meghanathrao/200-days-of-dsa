class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        res = []
        used = [False] * len(nums)

        def backtrack(path):
            if len(path) == len(nums):
                res.append(path[:])  # copy current permutation
                return
            for i in range(len(nums)):
                if not used[i]:
                    used[i] = True
                    path.append(nums[i])
                    backtrack(path)
                    path.pop()     # backtrack
                    used[i] = False

        backtrack([])
        return res
