class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String>result = new ArrayList<>();
        backtrack(s, 0, "", result);
        return result;
        
    }
    public void backtrack(String s, int index, String current, List<String>result){
        if(index == s.length()){
            result.add(current);
            return;

        }
        char ch = s.charAt(index);

        if(Character.isLetter(ch)){
            backtrack(s, index+1,current+Character.toLowerCase(ch), result);
            backtrack(s, index+1, current + Character.toUpperCase(ch), result);
        }else{
            backtrack(s, index+1, current+ch, result);
        }
    }
}