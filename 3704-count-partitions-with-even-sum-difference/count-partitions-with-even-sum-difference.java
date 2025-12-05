class Solution {
    public int countPartitions(int[] nums) {
        int count =0;
        int sum2 =0;
         int sum1 =0;
         int index =0;
        for(int i =0; i<nums.length;i++){
           
            sum1 +=nums[i];
        }
        if(sum1%2==0){
            return nums.length-1;
        }
        else return 0;

        
    }
}