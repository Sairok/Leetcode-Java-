class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> lst=new ArrayList<Boolean>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            max= max<candies[i] ? max=candies[i] : max;
        }
        for(int i=0;i<candies.length;i++){
            candies[i]=candies[i]+extraCandies;
        }
        for(int i=0;i<candies.length;i++){
            lst.add( max > candies[i] ? false : true);
        }
        return lst;
    }
}