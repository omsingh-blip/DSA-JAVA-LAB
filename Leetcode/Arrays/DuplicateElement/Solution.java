class Solution {
    public boolean containsDuplicate(int[] nums) {
        
       HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){

            int target = nums[i];

            if(set.contains(target)){
                return true;
            }

            else{
                set.add(target);
            }
        }

        return false;
    }
}