class Solution {
    public void rotate(int[] nums, int k) {
        int n =  nums.length;
        k = k %n;
        int j =0;
        int []copy = Arrays.copyOf(nums,n);
        for(int i = n-k; i<n;i++){
            nums[j++]=copy[i];
        }
        for(int i =0; i <n-k; i++){
            nums[j++]=copy[i];
        }
    


        
    }
}