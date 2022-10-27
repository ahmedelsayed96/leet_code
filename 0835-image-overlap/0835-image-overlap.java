class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int largetOverlap = 0;
        for(int row=-img1.length+1;row<img1.length;row++){
            for(int col =-img1.length+1;col<img1.length;col++){
                largetOverlap= Math.max(largetOverlap,overlapOnes(img1,img2,row,col));
            }
        }
        return largetOverlap;
    }
    public int overlapOnes(int[][] img1 ,int[][]img2,int rowOff,int colOff){
        int count =0;
        for(int row=0;row<img1.length;row++){
            for(int col=0;col<img1[0].length;col++){
                if((row+rowOff<0|| row+rowOff >=img1.length) || (col +colOff <0||col+colOff >=img1[0].length))
                    continue;
                if(img1[row][col]+img2[row+rowOff][col+colOff]==2)
                    count++;
            }
        }
        return count;
    }
}