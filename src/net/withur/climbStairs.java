package net.withur;

public class climbStairs {
    public int climbStairs(int n) {
        int a = 1;
        int b = 1;
        while(--n > 0) {
            a = (b += a) - a;
        }

        return b;
    }
}
