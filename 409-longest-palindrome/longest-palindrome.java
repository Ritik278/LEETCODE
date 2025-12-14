class Solution {
    public int longestPalindrome(String s) {
        boolean oddFound = false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i =0; i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }
        int result =0;
        for(int freq : map.values()){
            if(freq%2==0){
                result += freq;
            }else{
                result += freq-1;
                oddFound = true;
            }

        }
        if(oddFound ){
            return result+1;
        }
        return result;
        
    }
}