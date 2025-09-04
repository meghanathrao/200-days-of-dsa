class optimized_dp_java {
    public int rob(int[] nums) {
        int prev1 = 0, prev2 = 0;
        for (int num : nums) {
            int newVal = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = newVal;
        }
        return prev1;
    }

    public static void main(String[] args) {
        optimized_dp_java solver = new optimized_dp_java();
        int[] houses = {2, 7, 9, 3, 1};  
        int maxLoot = solver.rob(houses);
        System.out.println("Maximum loot possible: " + maxLoot);
    }
}