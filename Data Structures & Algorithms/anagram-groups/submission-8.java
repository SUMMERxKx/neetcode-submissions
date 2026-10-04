class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            int [] key = new int[26];
            for(char c : s.toCharArray()){
                key[c - 'a']++;
            }
            String sortedKey = Arrays.toString(key);
            res.putIfAbsent(sortedKey, new ArrayList<>());
            res.get(sortedKey).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
