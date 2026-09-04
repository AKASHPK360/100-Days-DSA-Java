class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxLength = 0;

        int[] count = new int[128];

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            count[ch]++;

            while (count[ch] > 1) {
                count[s.charAt(left)]--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
