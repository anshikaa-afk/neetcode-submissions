class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anaMap = new HashMap<>();
        for(String s:strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String str = String.valueOf(chars);
            if(anaMap.containsKey(str)){
                anaMap.get(str).add(s);
            } else {
                List<String> list = new ArrayList<>();
                anaMap.put(str,list);
                anaMap.get(str).add(s);
            }
        }

        List<List<String>> finallist = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : anaMap.entrySet()){
            finallist.add(entry.getValue());
        }
        return finallist;
    }
}
