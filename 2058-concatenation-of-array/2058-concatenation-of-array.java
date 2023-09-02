class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr=new int[(nums.length)*2];
        for(int index=0;index<nums.length;index++){
            arr[index]=nums[index];
            arr[nums.length+index]=nums[index];
        }
        return arr;
    }
}