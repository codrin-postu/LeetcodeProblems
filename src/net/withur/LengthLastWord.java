package net.withur;

public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        int currLen = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                currLen++;
            } else {
                if (currLen != 0)
                    break;
            }
        }

        return currLen;
    }
}
