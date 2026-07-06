class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    int n = temperatures.length;
    int[] res = new int[n];

    for (int i = 0; i < n; i++) {
        res[i] = 0; // default if we never find a warmer day

        for (int j = i + 1; j < n; j++) {
            if (temperatures[j] > temperatures[i]) {
                res[i] = j - i;
                break; // stop as soon as we find the first warmer day
            }
        }
    }

    return res;
}

}
