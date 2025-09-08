class Solution {
    public int[] getNoZeroIntegers(int n) {

        int [] ans = new int[2];

        for(int i =1; i <n;i++){
            int j = n-i;

            if(nozero(i) && nozero(j)){
                ans[0]=i;
                ans[1]=j;
            }



        }
        return ans;

        
    }

    private boolean nozero(int n){
        while(n>0){
            if(n%10==0)return false;
            n/=10;
        }
        return true;
    }
}