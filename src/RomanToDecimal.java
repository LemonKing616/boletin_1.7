import java.util.Scanner;

public class RomanToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número romano: ");
        String romanNumeral = sc.nextLine();
        int decimalNum = 0;
        int lastNum = 0;
        String romanNumeralUpper = romanNumeral.toUpperCase();

        for (int i = romanNumeralUpper.length() - 1; i >= 0 ; i--) {
            char ch = romanNumeralUpper.charAt(i);
            switch (ch) {
                case 'M':
                    decimalNum = processDecimal(1000, lastNum, decimalNum);
                    lastNum = 1000;
                    break;
                case 'D':
                    decimalNum = processDecimal(500, lastNum, decimalNum);
                    lastNum = 500;
                    break;
                case 'C':
                    decimalNum = processDecimal(100, lastNum, decimalNum);
                    lastNum = 100;
                    break;
                case 'L':
                    decimalNum = processDecimal(50, lastNum, decimalNum);
                    lastNum = 50;
                    break;
                case 'X':
                    decimalNum = processDecimal(10, lastNum, decimalNum);
                    lastNum = 10;
                    break;
                case 'V':
                    decimalNum = processDecimal(5, lastNum, decimalNum);
                    lastNum = 5;
                    break;
                case 'I':
                    decimalNum = processDecimal(1, lastNum, decimalNum);
                    lastNum = 1;
                    break;
            }
        }
        System.out.println("El número decimal equivalente es: " + decimalNum);
    }

    public static int processDecimal(int decimal, int lastNum, int lastDecimal) {
        if (lastNum > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }
    }
}

//Este programa solicita al usuario que introduzca un número romano y luego utiliza un bucle for para procesar cada letra del número romano. El método processDecimal() se utiliza para determinar si un número romano debe ser sumado o restado del número decimal acumulado, dependiendo de si la letra es seguida por una letra de igual o menor valor (suma) o una letra de mayor valor (resta).
//
//Espero que esto te sea útil.