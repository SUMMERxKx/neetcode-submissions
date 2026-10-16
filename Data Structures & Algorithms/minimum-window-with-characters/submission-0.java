class Solution {
    public String minWindow(String s, String t) {
        // Build the hashmap
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // uniqueCharacterCount
        int uniqueCharCount = freqMap.size();

        // slidingWindow
        int windowStart = 0;
        int windowEnd = 0;

        // storing answers
        int minValue = Integer.MAX_VALUE;
        int startIndex = -1;

        // slidingwindow
        while (windowEnd < s.length()) {
            char rightChar = s.charAt(windowEnd);
            if (freqMap.containsKey(rightChar)) {
                freqMap.put(rightChar, freqMap.get(rightChar) - 1);
                if (freqMap.get(rightChar) == 0) {
                    uniqueCharCount--;
                }
            }
            while (uniqueCharCount == 0) {
                int length = windowEnd - windowStart + 1;
                if (length < minValue) {
                    minValue = length;
                    startIndex = windowStart;
                }
                char leftChar = s.charAt(windowStart);
                if (freqMap.containsKey(leftChar)) {
                    freqMap.put(leftChar, freqMap.get(leftChar) + 1);

                    if (freqMap.get(leftChar) > 0) {
                        uniqueCharCount++;
                    }
                }
                windowStart++;
            }
            windowEnd++;
        }
        if (startIndex == -1) {
            return "";
        }

        return s.substring(startIndex, startIndex + minValue);
    }
}
