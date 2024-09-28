public class Binary_Conversions {
    public static boolean isValidBinary(String number) {
        String binary = number;
        if(binary.isEmpty()){
            return false;
        }
        for (char c : binary.toCharArray()) {
            if (c != '0' && c != '1') {
                System.out.println("Invalid Input: Not a valid binary number.");
                return false;
            }
        }
        return true;
    }
    public int BinaryToDecimal(String number) {

        int temp = Integer.parseInt(number);
        int i = 0;
        int result = 0;
        while (temp > 0) {

            int lastValue = temp % 10;
            temp = temp / 10;
            result = result + lastValue * (int) Math.pow(2, i++);
        }
//        System.out.println(result);
        return result;
    }
}
