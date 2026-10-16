class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //check length
        if(s1.length() > s2.length()){
            return false;
        }
        //build a freq array for both
        int [] countS1 = new int[26];
        int [] countS2 = new int[26];

        //build the window
        for(int i = 0; i < s1.length(); i++){
            countS1[s1.charAt(i) - 'a']++;
            countS2[s2.charAt(i) - 'a']++;
        }
        // compare the first window
        if(Arrays.equals(countS1,countS2)){
            return true;
        }
        //slide the window if its not 
        int l = 0;
        for(int r = s1.length(); r < s2.length(); r++){
            countS2[s2.charAt(r) - 'a']++;
            countS2[s2.charAt(l) - 'a']--;

            l++;

            if(Arrays.equals(countS1, countS2)){
                return true;
            }
        }
        return false;
        //return
    }
}
