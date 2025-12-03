class Solution {
    public String reverseWords(String s) {
        String [] words = s.trim().split("\\s+");
        String [] arr = new String[words.length];
        int index=0;
        for(int i =words.length-1; i>=0; i--){
            arr[index]=words[i];
            index++; 
        }
        return String.join(" ",arr);
        
    }
}