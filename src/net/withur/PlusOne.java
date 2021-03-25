package net.withur;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        var i = digits.length - 1;
        do {
            digits[i]++;
            if (digits[i] == 10) {
                digits[i] = 0;
                i--;
            } else {
                break;
            }
        } while (i != -1);

        if (i == -1) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for(i = 1; i < newDigits.length; i++){
                newDigits[i] = digits[i-1];
            }
            return newDigits;
        }
        return digits;
    }
}
