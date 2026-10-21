class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = 0;

        //find maxSpeed
        for(int pile: piles){
            maxSpeed = Math.max(pile, maxSpeed);
        }
        //Binary search
        while(minSpeed < maxSpeed){
            int mid = minSpeed + (maxSpeed - minSpeed)/2;

            if(kokoCanEat(piles, mid, h)){
                maxSpeed = mid;
            }else{
                minSpeed = mid+1;
            }
        }
        return minSpeed;
    }
    private boolean kokoCanEat(int[] piles, int speed, int h){
        long time = 0;
        for(int pile: piles){
            time += (long)Math.ceil((double)pile/speed);
        }
        return time <= h;
    }
}
