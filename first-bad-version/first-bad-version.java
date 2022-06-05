/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
    
        return findBadVersionInt(1,n);
    }
    public int findBadVersionInt(int left,int right){
        int mid =left+(right-left)/2 ;
        if(isBadVersion(mid)){
            if(!isBadVersion(mid-1))
                return mid;
            
            return findBadVersionInt(left,mid-1);
        }else{
            return findBadVersionInt(mid+1,right);
        }
    }
}