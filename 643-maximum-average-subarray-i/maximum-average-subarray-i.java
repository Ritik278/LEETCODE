class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double maxavg = -Double.MAX_VALUE;
        int sum =0;

        for(int i  =0; i<nums.length;i++){
            sum += nums[i];

            if(i>=k-1){
                double avg = (double) sum /k ; 
                maxavg = Math.max(maxavg, avg);

                 sum -= nums[i-k+1];

            }
        }
        return maxavg;
        
    }
}