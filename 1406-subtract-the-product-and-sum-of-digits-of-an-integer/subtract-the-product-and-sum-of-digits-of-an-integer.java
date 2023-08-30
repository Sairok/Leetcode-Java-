class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int mul=1;
        while(n>0){
            mul=n%10*mul;
            sum=n%10+sum;
            n=n/10;
        }
        return mul-sum;
    }
}