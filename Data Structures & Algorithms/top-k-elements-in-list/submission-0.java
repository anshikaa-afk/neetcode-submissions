class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> intMap = new HashMap<>();
        for(int num: nums){
            if(intMap.containsKey(num)){
                int value = intMap.get(num);
                intMap.put(num, value+1);
            } else{
                intMap.put(num, 1);
            }
        }

        List<Map.Entry<Integer,Integer>> list =intMap.entrySet().stream()
        .sorted(Map.Entry.<Integer, Integer>comparingByValue(Comparator.reverseOrder()))
        .collect(Collectors.toList());
        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = list.get(i).getKey();
        }
        return ans;
    }
}
