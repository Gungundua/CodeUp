/***
 * Problem Statement - It is Number system conversion program which includes calling methods and operations
 * Owner Name - Gungun Dua
 * Date of Creation - 26/09/24
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Constants constant = new Constants();
        System.out.println(constant.EXAMPLE_1);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(constant.INTERRUPTION);
        }

        System.out.println(constant.EXAMPLE_2);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(constant.INTERRUPTION);
        }

        while (true) {
            System.out.println(constant.QUESTION);
            String question = scan.nextLine();
            if (question.isEmpty()) {
                System.out.println(constant.UNSUPPORTED_CONVERSION);
                scan.close();
                return;
            }

            Binary_Conversions binary = new Binary_Conversions();
            Decimal_Conversions decimal = new Decimal_Conversions();
            Octal_Conversions octal = new Octal_Conversions();
            HexaDecimal_Conversions hexadecimal = new HexaDecimal_Conversions();

            String[] words = question.split(" ");

            if (words.length < 7) {
                System.out.println(constant.UNSUPPORTED_CONVERSION);
                continue;
            }

            String convertingFrom = words[2].toLowerCase();
            String convertingTo = words[6].toLowerCase();
            String digit;
            digit = words[4];

            if(digit.length() > 10){
                System.out.println("Invalid input");
            }


            switch (convertingFrom) {
                case "binary":
                    switch (convertingTo) {
                        case "decimal":
                            if(Binary_Conversions.isValidBinary(digit)){
                            int temporary = binary.BinaryToDecimal(digit);
                            System.out.println(temporary);
                            }
                            break;
                        case "hexadecimal":
                            if(Binary_Conversions.isValidBinary(digit)){
                            decimal.DecimalToHexadecimal(digit);
                            }
                            break;

                        case "octal":
                            if(Binary_Conversions.isValidBinary(digit)){
                            decimal.DecimalToOctal(digit);
                            }
                            break;
                        default:
                            System.out.println(constant.UNSUPPORTED_CONVERSION);
                            break;
                    }
                    break;

                case "decimal":
                    switch (convertingTo) {
                        case "binary":
                            if(Decimal_Conversions.isValidDecimal(digit)){
                            decimal.DecimalToBinary(digit);
                            }
                            break;
                        case "hexadecimal":
                            if(Decimal_Conversions.isValidDecimal(digit)){
                            decimal.DecimalToHexadecimal(digit);
                            }
                            break;
                        case "octal":
                            if(Decimal_Conversions.isValidDecimal(digit)){
                            decimal.DecimalToOctal(digit);
                            }
                            break;
                        default:
                            System.out.println(constant.UNSUPPORTED_CONVERSION);
                            break;
                    }
                    break;

                case "octal":
                    switch (convertingTo) {
                        case "binary":
                            if(Octal_Conversions.isValidOctal(digit)){
                            String tempBinary = octal.OctalToBinary(digit);
                            System.out.println(tempBinary);
                            }
                            break;
                        case "decimal":
                            if(Octal_Conversions.isValidOctal(digit)){
                            int tempDecimal = octal.OctalToDecimal(digit);
                            System.out.println(tempDecimal);
                            }
                            break;
                        case "hexadecimal":
                            if(Octal_Conversions.isValidOctal(digit)){
                            int tempHexa = octal.OctalToDecimal(digit);
                            String tempHexa2 = Integer.toString(tempHexa);
                            decimal.DecimalToHexadecimal(tempHexa2);
                            }
                            break;
                        default:
                            System.out.println(constant.UNSUPPORTED_CONVERSION);
                            break;
                    }
                    break;

                case "hexadecimal":
                    switch (convertingTo) {
                        case "binary":
                            if(HexaDecimal_Conversions.isValidHexadecimal(digit)){
                             HexaDecimal_Conversions.HexadecimalToBinary(digit);
                            }
                            break;
                        case "decimal":
                            if(HexaDecimal_Conversions.isValidHexadecimal(digit)){
                            int temphexadecimal = hexadecimal.HexadecimalToDecimal(digit);
                            System.out.println(temphexadecimal);
                            }
                            break;
                        case "octal":
                            if(HexaDecimal_Conversions.isValidHexadecimal(digit)){
                            HexaDecimal_Conversions.HexadecimalToOctal(digit);
                            }
                            break;
                        default:
                            System.out.println(constant.UNSUPPORTED_CONVERSION);
                            break;
                    }
                    break;

                default:
                    System.out.println(constant.UNSUPPORTED_CONVERSION);
                    break;
            }
        }
    }
}

