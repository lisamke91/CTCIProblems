/*
 * 8.1 A child is running up a staircase with n steps and can hop either 1 step,
 * 2 steps, or 3 steps at a time. Implement a method to count how many possible
 * ways the child can run up the stairs.
 */

public class TripleStep {
    public static int countNumWays(int n) {
        if(n == 0) return 0;
        return countHelper(n, 0);
    }

    private static int countHelper(int n, int currentStep) {
        // base case
        if(currentStep == n) {
            return 1;
        }
        int numWays = 0;
        if(n - currentStep >= 1) {
            numWays += countHelper(n, currentStep + 1);
        }
        if(n - currentStep >= 2) {
            numWays += countHelper(n, currentStep + 2);
        }
        if(n - currentStep >= 3) {
            numWays += countHelper(n, currentStep + 3);
        }
        return numWays;
    }
}
