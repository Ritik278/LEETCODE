class Solution {
    public void reverseString(char[] s) {
       char [] ch = new char[s.length];
       int index =0;

       for(int i=s.length-1; i>=0; i--){
        ch[index]= s[i];
        index++;


       }
        for(int i =0; i<s.length; i++){
            s[i]=ch[i];
        }

        
    }
}