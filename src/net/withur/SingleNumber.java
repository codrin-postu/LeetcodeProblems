package net.withur;

import java.util.ArrayList;
import java.util.HashMap;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> singleAppearance = new ArrayList<>();
        for (var num : nums
        ) {
            if (!singleAppearance.contains(num)) {
                singleAppearance.add(num);
            } else {
                singleAppearance.remove(singleAppearance.indexOf(num));
            }
        }
        return singleAppearance.get(0);
    }
}
