import java.util.Random;

class Solution {
    private int[] nums;
    private int[] shuffledNums;
    private Random random;
    
    public Solution(int[] nums) {
        this.nums=nums;
        this.shuffledNums=nums.clone();
        this.random =new Random();
    }
    
    public int[] reset() {
          return nums;
    }
    
    public int[] shuffle() {
        
        
        for(int i=0;i<nums.length;i++){
        int rand =random.nextInt(nums.length);
            swap(i,rand);
        }
        
        return shuffledNums;
    }
    private void swap(int i, int j){
        int temp=shuffledNums[i];
        shuffledNums[i] = shuffledNums[j];
        shuffledNums[j] = temp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */