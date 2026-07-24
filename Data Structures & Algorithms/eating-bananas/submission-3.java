class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for(int pile:piles){
            right = Math.max(right, pile);
        }
        int result = right;
        while(left <= right){
            int speed = left+(right - left)/2;

            long totalTime = 0;
            for(int pile: piles){
                totalTime += (long) Math.ceil((double)pile/speed);
            }
            if(totalTime <=h){
                result = speed;
                right = speed - 1;
            }
            else{
                left = speed +1;
            }

        }
        return result;
    }
}