
import java.util.*;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int sumA = 0;
        int sumB = 0;

        for (int x : aliceSizes) {
            sumA += x;
        }

        for (int x : bobSizes) {
            sumB += x;
        }

        int diff = (sumA - sumB) / 2;

        HashSet<Integer> set = new HashSet<>();

        for (int x : aliceSizes) {
            set.add(x);
        }

        for (int b : bobSizes) {
            int a = b + diff;

            if (set.contains(a)) {
                return new int[]{a, b};
            }
        }

        return new int[0];
    }
}
