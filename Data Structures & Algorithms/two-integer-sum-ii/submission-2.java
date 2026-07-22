class Solution {
    public int[] twoSum(int[] numbers, int target) {
       Map<Integer,Integer> numMap = new HashMap<>();
        for(int i =0;i<numbers.length;i++){
            System.out.print("num "+ numbers[i]+" target-num "+ (target-numbers[i]));
            if(numMap.containsKey(target-numbers[i])){
                int index1 = numMap.get(target-numbers[i]);
                return new int[]{index1, i+1};
            } else{
                numMap.put(numbers[i], i+1);
            }
        }
        return new int[]{};
    }
}
