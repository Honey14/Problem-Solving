class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        for(i=0; i<nums.length; i++){
            for(j=i+1; j<nums.length; j++){
                int number = target - nums[j];
                if(nums[i] == number){
                    return new int[]{i , j};
                }
            }
        }
        throw new IllegalArgumentException("No sum available");
    }
    
}