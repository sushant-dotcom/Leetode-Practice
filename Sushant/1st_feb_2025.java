class Solution {
    public static int largest(int[] arr) {
        // code here
        int ans=0;
        for(int x : arr){
            ans=Math.max(ans,x);
        }
        return ans;
    }
}