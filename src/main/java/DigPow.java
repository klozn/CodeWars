package main.java;

public class DigPow {

    /**
     *Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
     *
     */
    public static long digPow(int n, int p) {
        String[] digitArr = Integer.toString(n).split("");
        int nrOfDigits = digitArr.length;

        int digPowSum = 0;
        for (int i = 0; i < nrOfDigits; i++) {
            int digit = Integer.parseInt(digitArr[i]);
            digPowSum += Math.pow(digit, p + i);
        }

        if (digPowSum % n == 0) {
            return digPowSum / n;
        }
        return -1;
    }

    public static void main(String[] args) {
        digPow(695, 2);
    }
}
