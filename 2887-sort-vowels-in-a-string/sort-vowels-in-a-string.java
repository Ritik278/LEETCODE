class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> list1= new ArrayList<>();
         ArrayList<Character> list2= new ArrayList<>();
         int n = s.length();
         for(int i=0; i<n;i++){
            char c = s.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                list1.add(c);
            }else{
                list2.add(c);
            }

         }
         Collections.sort(list1);
        String ans ="";
        int i1 =0;
        int i2=0;
        for(int i=0; i<n;i++){
            char c = s.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                ans+=list1.get(i1);
                i1++;
            }else{
                ans+=list2.get(i2);
                i2++;
            }

         }
         return ans;


        
    }
}