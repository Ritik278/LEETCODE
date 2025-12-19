class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder ();
        StringBuilder sz = new StringBuilder();

        for(int i =0; i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '#'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }else{
                sb.append(ch);
            }
        }
          for(int i =0; i<t.length();i++){
            char ch = t.charAt(i);

            if(ch == '#'){
                if(sz.length()>0){
                    sz.deleteCharAt(sz.length()-1);
                }
            }else{
                sz.append(ch);
            }
        }
        return sb.toString().equals(sz.toString());
        
    }
}