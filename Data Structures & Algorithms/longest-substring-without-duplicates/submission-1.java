class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int left = 0;
        int res = 0;

        for(int right = 0; right < s.length(); right++){
            
            char c = s.charAt(right);
            if(mp.containsKey(c)){
                left = Math.max(left, mp.get(c) + 1);
            }
            
            mp.put(c, right);
            
            res = Math.max(res, right - left + 1);
        }
        return res;
        
    }
}
