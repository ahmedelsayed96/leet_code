class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i =m-1;
        int j =n-1;
        int index=nums1.length-1;
        while ( j!=-1){
           if(i!=-1 &&nums1[i]>nums2[j]){
               nums1[index]=nums1[i];
               i--;
               index--;
           }else {
               nums1[index]=nums2[j];
               j--;
               index--;
           }
        }
        
    }
    
}