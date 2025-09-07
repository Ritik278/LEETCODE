class Solution {
    public boolean canJump(int[] nums) {
        // if(nums[0]==0 && nums.length ==1){
        //     return true;
        // }

        int maxpower =0;

        for(int i =0; i<nums.length;i++){
            if(maxpower>=i){
                int power = i + nums[i];
                maxpower = Math.max(power, maxpower);

            }
        }
        if(maxpower >= nums.length-1){
            return true;
        }
        return false;
        
    }
}