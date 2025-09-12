class Solution {
    public boolean doesAliceWin(String s) {
        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);
            if(c=='A' ||c=='E'||c=='I'||c=='O'||c=='u'||c=='a' ||c=='e'||c=='i'||c=='o'||c=='u'){
                return true;
            }
        }
        return false;
        
    }
}