class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n = nums.length;
        int index =0;

        List<Integer> list = new ArrayList<>();

        for(int num :nums){
            if(num >=0){
                list.add(num);
            }
        }

        int size = list.size();
        if (size == 0) return nums;

        k = k%size;
        Collections.rotate(list,size-k);

        for(int i =0; i<n;i++){
            if(nums[i]>=0){
                nums[i]=list.get(index++);
            }
        }
        return nums;
    }
}