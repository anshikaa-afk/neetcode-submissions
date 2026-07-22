class Solution {
    public boolean isPalindrome(String s) {
        String string = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reverse = new StringBuilder(string).reverse().toString();
        System.out.println("string "+string+" reverse "+reverse);
        if(reverse.equals(string)){
            return true;
        }
        return false;
    }
}
