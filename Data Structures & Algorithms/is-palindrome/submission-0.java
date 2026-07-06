class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                newStr.append(Character.toLowerCase(c));
            }   
        }
        String cleaned = newStr.toString();
        StringBuilder rev = new StringBuilder(cleaned);
        rev.reverse();
        String reverse = rev.toString();
        boolean same = cleaned.equals(reverse);
return same;
    }

}
