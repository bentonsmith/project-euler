public class Problem1 {
    public static int threeFiveSum(int max) {
        int total = 0;
        for (int i = 0; i < max; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
            }
        }
        return total;
    }
}
