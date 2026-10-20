// basil206
import java.math.BigInteger;

class Armstrong {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java Armstrong <integer>");
            return;
        }

        BigInteger number;
        try {
            number = new BigInteger(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Please provide a valid integer.");
            return;
        }

        if (number.signum() < 0) {
            System.out.println(number + " is not Armstrong");
            return;
        }

        String digits = number.toString();
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '0';
            sum = sum.add(BigInteger.valueOf(digit).pow(digits.length()));
        }

        if (sum.equals(number)) {
            System.out.println(number + " is Armstrong");
        } else {
            System.out.println(number + " is not Armstrong");
        }
    }
}
