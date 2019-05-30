public class Problem3 {
    public static long largestPrimeFactor (long max) {
        java.util.ArrayList<Long> numberArray= new java.util.ArrayList<>();
        java.util.ArrayList<Boolean> isNotDone = new java.util.ArrayList<>();

        // Populating list of numbers and booleans
        for (long i = 0; i < max - 1; i++) {
            numberArray.get(i) = + 2;
            isNotDone[i] = true;
        }

        // Finding prime numbers
        for(long i = 0; i < max - 1; i++) {
            if(isNotDone[i]) {
                for(long j = i; j < max - 1; j += numberArray[i]) {
                    isNotDone[j] = false;
                }
                isNotDone[i] = true;
            }
        }

        // Getting an ArrayList of prime numbers
        java.util.ArrayList<Integer> primeNumbers = new java.util.ArrayList<>();

        for(long i = 0; i < max - 2; i++) {
            if(isNotDone[i]) {
                primeNumbers.add(numberArray[i]);
            }
        }

        long maxVal = 0;

        // Finding largest prime factor
        for (long number : primeNumbers) {
            if (max % number == 0) {
                maxVal = number;
            }
        }
        return maxVal;
    }
}
