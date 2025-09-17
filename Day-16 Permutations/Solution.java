class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(new ArrayList<>(), used, nums, res);
        return res;
    }

    private void backtrack(List<Integer> path, boolean[] used, int[] nums, List<List<Integer>> res) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                path.add(nums[i]);
                backtrack(path, used, nums, res);
                path.remove(path.size() - 1); // backtrack
                used[i] = false;
            }
        }
    }
}
