class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedS = new String(charArr);

            map.putIfAbsent(sortedS, new ArrayList<>());
            map.get(sortedS).add(str);
        }
        return new ArrayList(map.values());
    }
}
