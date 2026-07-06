class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                satisfied += customers[i];
            }
        }
        int extra = 0;
        int maxExtra = 0;

        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                extra += customers[i];
            }
        }
        maxExtra = extra;
        for (int right = minutes; right < customers.length; right++) {
            if (grumpy[right] == 1) {
                extra += customers[right];
            }
            if (grumpy[right - minutes] == 1) {
                extra -= customers[right - minutes];
            }
            maxExtra = Math.max(maxExtra, extra);
        }
        return satisfied + maxExtra;
    }
}
