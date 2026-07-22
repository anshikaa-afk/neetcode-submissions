class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> setNums = new HashSet<>();
        for(int num: nums){
            setNums.add(num);
        }
        int longestCount = 1;
        for(int num:setNums){
            int count =1;
            if(!setNums.contains(num-1)){
                int n=1;
                while(setNums.contains(num+n)){
                    count++;
                    n++;
                    System.out.println("num:"+n+" count: "+count);
                }
            }
            if(count>longestCount){
                longestCount=count;
            }
        }
        return longestCount;
    }
}
