class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDig = -1;
        int maxArea = -1;

        for(int i =0; i <dimensions.length; i++){
            int l = dimensions[i][0];
            int w = dimensions[i][1];

            int dig = l*l+ w*w;
            int area = l*w;

            if(dig>maxDig ||(dig==maxDig && area >maxArea)){
                maxDig = dig;
                maxArea = area;
            }
        }
        return maxArea;
        
    }
}