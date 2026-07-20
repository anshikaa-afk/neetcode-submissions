class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()==t.length()){
            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();
            Arrays.sort(sArray);
            Arrays.sort(tArray);
            System.out.println(sArray);
            System.out.println(tArray);
            return Arrays.equals(sArray, tArray);
        } else{
            return false;
        }
    }
}
