class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>>  res = new HashMap<>();
        for(String s : strs){
            char[] key = s.toCharArray();
            Arrays.sort(key);
            String sortedKey = new String(key);
            res.putIfAbsent(sortedKey, new ArrayList<>());
            res.get(sortedKey).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
