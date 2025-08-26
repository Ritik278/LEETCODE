class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(num);
        int digits []= new int[str.length()];
        int count =0;
        for(int i =0 ; i <str.length(); i++){
            digits[i]= str.charAt(i)-'0';

            if(count ==0 &&digits[i]!=9){
                digits[i]=9;
                count++;
            } 
        }
        for(int i =0; i <digits.length; i++){
            sb.append(digits[i]);
        }
        int ans= Integer.parseInt(sb.toString());

        return ans;
    }
}