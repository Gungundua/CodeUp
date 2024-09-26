public class HexaDecimal_Conversions{

    public static boolean isValidHexadecimal(String number) {
        String hexadecimal = number;
        if (hexadecimal == null || hexadecimal.isEmpty()) {
            return false;
        }

        hexadecimal = hexadecimal.trim().toUpperCase();

        for (int i = 0; i < hexadecimal.length(); i++) {
            char hexCharacter = hexadecimal.charAt(i);
            if (!((hexCharacter >= '0' && hexCharacter <= '9') || (hexCharacter >= 'A' && hexCharacter <= 'F'))) {
                System.out.println("Invalid Input: Not a valid hexadecimal number.");
                return false;
            }
        }
        return true;
    }
    public static int HexadecimalToDecimal(String number) {
        String hexadecimal = number;
        if(hexadecimal.equals("0")){
            return 0;
        }
        if (hexadecimal == null || hexadecimal.isEmpty()) {
            throw new IllegalArgumentException("Invalid input: Input cannot be null or empty.");
        }

        // Trim leading and trailing spaces and convert to uppercase
        hexadecimal = hexadecimal.trim().toUpperCase();
        int decimal = 0;
        for(int i = 0;i < hexadecimal.length();i++){
            int value = 0;
            char hexCharacter = hexadecimal.charAt(i);
            if (hexCharacter >= '0' && hexCharacter <= '9') {
                value = hexCharacter - '0';
            }
            else if (hexCharacter >= 'A' && hexCharacter <= 'F') {
                value = 10 + (hexCharacter - 'A');
            }
            else if (hexCharacter >= 'a' && hexCharacter <= 'f') {
                value = 10 + (hexCharacter - 'a');
            }
            else {
                System.out.println( "Invalid hexadecimal character.");
                return 0;
            }
            decimal = 16 * decimal + value;
        }
        return decimal;
    }
    public static void HexadecimalToBinary(String number) {
        int decimal = HexadecimalToDecimal(number);
        String binary = Integer.toString(decimal);
        String result = Decimal_Conversions.DecimalToBinary(binary);
        System.out.println(result);
    }
    public static void HexadecimalToOctal(String number) {
        int decimal = HexadecimalToDecimal(number);
        String binary = Integer.toString(decimal);
        String result = Decimal_Conversions.DecimalToOctal(binary);
        System.out.println(result);
    }
}
