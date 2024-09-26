public class Octal_Conversions {
    public static boolean isValidOctal(String number) {
        String octal = number;
        for (int i = 0; i < octal.length(); i++) {
            char digit = octal.charAt(i);
            if (digit < '0' || digit > '7') {
                System.out.println("Invalid Input: Not a valid octal number.");
                return false;
            }
        }
        return true;
    }
    public String OctalToBinary(String number) {
        int octalNumber = Integer.parseInt(number);
        int decimalNumber = 0;
        int temp = octalNumber;
        int i = 0;

        while (temp > 0) {
            int lastDigit = temp % 10;
            temp = temp / 10;
            decimalNumber = decimalNumber + lastDigit * (int) Math.pow(8, i++);
        }
        String binaryResult = "";
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            decimalNumber = decimalNumber / 2;
            binaryResult = remainder + binaryResult;
        }

        return binaryResult;
    }
    public int OctalToDecimal(String number) {
        int octalNumber = Integer.parseInt(number);
        int decimalNumber = 0;
        int temp = octalNumber;
        int i = 0;

        while (temp > 0) {
            int lastDigit = temp % 10;
            temp = temp / 10;
            decimalNumber = decimalNumber + lastDigit * (int) Math.pow(8, i);
            i++;
        }
        return decimalNumber;
    }
}
