class Solution {
    public String largestGoodInteger(String num) {
        char[] arr = num.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for(int i =0; i <arr.length-2;i++){
           
            if(arr[i] == arr[i+1] && arr[i+1] == arr[i+2]){
                list.add(arr[i]);
            }
        }
         if (list.isEmpty()) {
            return "";
        }
        char max1 = Collections.max(list);
        String result = String.valueOf(max1).repeat(3);

        return result;
        
    }
}