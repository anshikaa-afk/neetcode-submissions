class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        Set<Character> charSet = new HashSet<>();
        int maxLength=1;
        int left=0;
        int right=0;
        while(right<s.length()){
            if(!charSet.contains(s.charAt(right))){
                charSet.add(s.charAt(right));
                right++;
                maxLength=Math.max(charSet.size(),maxLength);
            } else{
                charSet.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
