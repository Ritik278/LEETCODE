class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" "); 
        int count = 0;

       
        HashSet<Character> broken = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) {
            broken.add(c);
        }

       
        for (String word : words) {
            boolean canType = true;
            for (char c : word.toCharArray()) {
                if (broken.contains(c)) {
                    canType = false;
                    break; 
                }
            }
            if (canType) count++;
        }

        return count;
    }
}
