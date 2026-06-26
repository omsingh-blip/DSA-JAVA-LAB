class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int[] ans = new int[2];
        int complement;

        for(int i=0; i<nums.length; i++){

            complement = target - nums[i];
            if(map.containsKey(complement)){

                ans[0]= i;
                ans[1]= map.get(complement);

                return ans;
            }

            else{
                map.put(nums[i], i);
            }
        }

        return ans;
    }
}