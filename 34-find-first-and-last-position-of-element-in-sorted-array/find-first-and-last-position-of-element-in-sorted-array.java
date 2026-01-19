class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurence(nums,target);
        int last = lastoccurence(nums,target);

        return new int[]{first,last};
    }
    public int firstOccurence(int[] arr, int target){
        int n = arr.length;
        int left =0;
        int right =n-1;
        int ans = -1;

        while(left<=right){
            int mid = left + (right-left)/2;

            if(arr[mid]==target){
                ans = mid;

                right = mid-1;
            }
            else if(arr[mid]<target){
                left = mid+1;
            }else{
                right= mid-1;
            }
        }
        return ans;
    }
    public int lastoccurence(int[] arr, int target){
        int n = arr.length;
        int left =0;
        int right =n-1;
        int ans = -1;

        while(left<=right){
            int mid = left +(right-left)/2;

            if(arr[mid]==target){
                ans = mid;

                left = mid+1;
            }else if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;


    }
}