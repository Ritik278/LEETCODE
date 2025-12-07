class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String[] arr = s.trim().split("[^a-z0-9]+");
        String s2 = "";
        for(String s1 : arr){
            s2+=s1;
        }
        int index = s2.length()-1;
        for(int i =0; i<s2.length()/2;i++){
            
            if(s2.charAt(i)!=s2.charAt(index)){
                return false;
            }
            index--;
        }
        return true;    
    }
}