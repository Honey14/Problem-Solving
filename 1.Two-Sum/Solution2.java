class Solution2 {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer , Integer> hashmap = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int number_here = target - nums[i];
            if(hashmap.containsKey(number_here)){
                return new int[]{hashmap.get(number_here),i};
            }
            hashmap.put(nums[i],i);
        }
        throw new IllegalArgumentException("No sums found");
    }
}