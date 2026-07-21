class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] res = new int [temperatures.length];
        Stack<int[]> stack = new Stack<>(); 
        for(int i = 0; i < temperatures.length; i++){
            int t = temperatures[i];
            while(!stack.isEmpty() && t > stack.peek()[0]){
                int [] tmp = stack.pop();
                res[tmp[1]] = i - tmp[1];
            }
            stack.push(new int []{t, i});
        }
        return res;
    }
}
