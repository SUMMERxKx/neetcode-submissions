
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;

        // deque stores indexes
        Deque<Integer> deque = new ArrayDeque<>();

        // number of windows
        int[] result = new int[n - k + 1];

        // build the first window
        for (int i = 0; i < k; i++) {

            // remove smaller values from the back
            while (!deque.isEmpty()
                    && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            // add current index
            deque.offerLast(i);
        }

        // max of first window
        result[0] = nums[deque.peekFirst()];

        // process the rest of the windows
        for (int i = k; i < n; i++) {

            // remove expired index from the front
            if (deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // remove smaller values from the back
            while (!deque.isEmpty()
                    && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            // add current index
            deque.offerLast(i);

            // front always points to the max
            result[i - k + 1] = nums[deque.peekFirst()];
        }

        return result;
    }
}