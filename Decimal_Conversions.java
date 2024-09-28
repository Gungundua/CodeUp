public class Decimal_Conversions {
    public static boolean isValidDecimal(String number) {
        String decimal = number;
        if (decimal.isEmpty()) {
            return false;
        }
        for (char ch : decimal.toCharArray()) {
            if (ch > '9') {
                System.out.println("Invalid Input: Not a valid Decimal number.");
                return false;
            }
        }
        return true;
}
    public static String DecimalToBinary(String number){
        int temp = Integer.parseInt(number);
        String result = "";
        //0-9
        while(temp > 0){
            int remainder = temp%2;
            temp = temp/2;
            result = remainder + result;
        }
        return result;
    }
    public static String DecimalToHexadecimal(String number){
        int temp = Integer.parseInt(number);
        char hexadecimal[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D','E', 'F'};
        String result = " ";
        while(temp > 0){
            int remainder = temp%16;
            result = hexadecimal[remainder] + result;
            temp = temp/16;
        }
        return result;
    }

    public static String DecimalToOctal(String number){
        int temp = Integer.parseInt(number);
        String result = " ";
        while(temp > 0){
            int remainder = temp%8;
            result = remainder + result;
            temp = temp/8;
        }
        return result;
    }
}
