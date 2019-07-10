public class Problem3 {
    public static long largestPrimeFactor (long max) {
        long test = max;

        while (test % 2 == 0) {
            test /= 2;
        }

        for(long i = 3; i < test; i++) {
            while (test % i == 0 && i < test) {
                test /= i;
            }
        }

        return test;
    }
}
