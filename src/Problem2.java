public class Problem2 {
    public static int evenFib(int max) {
        int prev1 = 1;
        int prev2 = 2;
        int current = 0;
        int sum = 2;

        while(current <= max) {
            current = prev1 + prev2;
            if (current % 2 == 0 & current < max) {
                sum += current;
            }
            prev1 = prev2;
            prev2 = current;
        }
        return sum;
    }
}
