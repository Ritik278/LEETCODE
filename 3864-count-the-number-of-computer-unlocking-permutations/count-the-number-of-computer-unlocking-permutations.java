class Solution {
    private static final int MOD = 1_000_000_007;

    public int countPermutations(int[] complexity) {

        int n =complexity.length;


        for(int i =1; i<n;i++){
            if(complexity[0]>=complexity[i]){
                return 0;
            }
        }
        long result = 1;
        for(int i =n-1; i>0;i--){
            result = (result * i) % MOD;

        }
       

        return (int) result;
        
    }
   
}