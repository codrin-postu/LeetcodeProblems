package net.withur;

public class RomanToInteger {
    public int romanToInt(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M':
                    number += 1000;
                    continue;
                case 'D':
                    number += 500;
                    continue;
                case 'C':
                    if (i < s.length() - 1) {
                        if (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') {
                            number -= 100;
                            continue;
                        }
                    }
                    number += 100;
                    continue;
                case 'L':
                    number += 50;
                    continue;
                case 'X':
                    if (i < s.length() - 1) {
                        if (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C') {
                            number -= 10;
                            continue;
                        }
                    }
                    number += 10;
                    continue;
                case 'V':
                    number += 5;
                    continue;
                case 'I':
                    if (i < s.length() - 1) {
                        if (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X') {
                            number -= 1;
                            continue;
                        }
                    }
                    number += 1;
            }
        }
        return number;
    }
}

/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */
