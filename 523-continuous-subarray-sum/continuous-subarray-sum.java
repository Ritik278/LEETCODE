class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);

        int sum =0;
        for(int i =0; i<nums.length;i++){
            sum = sum+nums[i];
            int need = sum%k;

            if(map.containsKey(need)){
                if(i- map.get(need)>=2){
                    return true;
                }
            }else{
                map.put(need,i);
            }

        }
        return false;
        
    }
}