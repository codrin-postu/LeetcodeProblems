package net.withur;

public class LongestSubstringNoRepeatCharSolution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstr = 0, currentSubstr = 0;
        String subString = new String();

        for (int i = 0; i < s.length(); i++) {
            if ((subString != null && subString.contains("" + s.charAt(i)) == true) ) {
                currentSubstr = subString.length();
                longestSubstr = currentSubstr > longestSubstr ? currentSubstr : longestSubstr;
                subString = subString.substring(subString.indexOf(s.charAt(i)) + 1);
            }
            subString += s.charAt(i);
        }
            currentSubstr = subString.length();
            longestSubstr = currentSubstr > longestSubstr ? currentSubstr : longestSubstr;

        return longestSubstr;
    }
}
