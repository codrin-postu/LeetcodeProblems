package net.withur;

public class ReverseIntegerSolution {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            if ((long) reversed * 10 + x % 10 > Integer.MAX_VALUE || (long) reversed * 10 + x % 10 < Integer.MIN_VALUE) {
                return 0;
            }
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }
        return reversed;
    }
}
