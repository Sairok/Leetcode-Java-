class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr =new int[nums.length];
        arr[0]=nums[0];
        for(int i=0;i<arr.length;i++){
            arr[i]=( i&1)==1 ? nums[n+i/2] : nums[i/2] ;
        }
        return arr;
    }
}
