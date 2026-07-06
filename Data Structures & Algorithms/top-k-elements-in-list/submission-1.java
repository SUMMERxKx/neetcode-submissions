class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int num : nums){
            count.put(num, count.getOrDefault(num,0) + 1);
        }//hashmap banaya
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }//array ke ander dala
        arr.sort((a,b) -> b[0] - a[0]);// sort kiya ab freq pe
        int[] res = new int[k];
        for(int i = 0; i <k; i++){
            res[i]= arr.get(i)[1];
        }
        return res;
    }
}
