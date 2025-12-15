class Solution {
    public int maxVowels(String s, int k) {
        
        int maxcount = 0;
        int count =0;

        for(int i =0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'i' || ch =='e'|| ch =='o' || ch == 'u'){
                count++;
            }
            if(i >=k-1){
                maxcount = Math.max(count, maxcount);
                if(s.charAt(i-k+1)=='a' || s.charAt(i-k+1)=='e' || s.charAt(i-k+1)=='i' || s.charAt(i-k+1)=='o'|| s.charAt(i-k+1)=='u' ){
                    count--;
                }
            }


        }
        return maxcount;

        
    }
}