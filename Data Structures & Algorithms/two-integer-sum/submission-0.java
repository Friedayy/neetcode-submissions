class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            int current = nums[i];
            int needed = target - current;
            if (freq.containsKey(needed)) {
                return new int[]{freq.get(needed), i};
            }
            freq.put(current, i);
        }
        return new int[]{};
    }
}
