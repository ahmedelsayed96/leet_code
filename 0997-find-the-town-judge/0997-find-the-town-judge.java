class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] a =new int[n+1];
        for(int[] arr: trust ) a[arr[1]]++;
        int judge =-1;
        for(int i= 1; i<n+1;i++)if(a[i]==n-1) judge=i;
        for(int[] arr: trust) if(arr[0]==judge) return -1;
        return judge ;
    }
}