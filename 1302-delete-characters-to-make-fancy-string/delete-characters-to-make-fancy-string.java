class Solution {
    public String makeFancyString(String s) {
        StringBuilder t = new StringBuilder();
        int count =1;
        t.append(s.charAt(0));
        for(int i =1; i<s.length();i++){

            
            if( s.charAt(i) == s.charAt(i-1)){
                
                count++;
                
            }else{
                count =1;
            }
            if(count<=2){
                t.append(s.charAt(i));
            }
        }
       return t.toString();
        
    }
}