class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> maps = new HashMap<>();
        for(int num: nums){
            if(maps.containsKey(num)){
                return true;
            } else{
                maps.put(num, 1);
            }
        }
        return false;
    }
}