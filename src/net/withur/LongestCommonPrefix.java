package net.withur;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        var currPrefix = strs[0];
        for (String str : strs
        ) {
            if (currPrefix.length() > str.length()) {
                currPrefix = currPrefix.substring(0, str.length());
            }
            int i = 0;
            boolean equal = true;
            while (equal && i < Math.min(str.length(), currPrefix.length())) {
                if (currPrefix.charAt(i) != str.charAt(i)) {
                    currPrefix = currPrefix.substring(0, i);
                    equal = false;
                }
                i++;
            }

        }
        return currPrefix;
    }
}
