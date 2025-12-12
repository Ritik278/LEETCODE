class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start =0; 
        int maxlen =0;

        HashMap<Character, Integer> lastIndex = new HashMap<>();

        for(int i =0; i<s.length();i++){
            char ch = s.charAt(i);

            if(lastIndex.containsKey(ch) && lastIndex.get(ch)>= start){
                start = lastIndex.get(ch)+1;
            }
            lastIndex.put(ch,i);

            int currlen = i-start+1;

            if(currlen>maxlen){
                maxlen = currlen;
            }

        }
        return maxlen;
        
    }
}