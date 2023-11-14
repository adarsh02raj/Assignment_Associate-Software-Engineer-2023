import java.util.Scanner;

public class RomanToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String romanNumber;
        System.out.println("Enter a Roman number: ");
        romanNumber = sc.nextLine();
        System.out.println(convertIntodecimal(romanNumber));
    }
    //function for converting roman to decimal
    private static int convertIntodecimal(String romanNumber) {
        int result = 0;

        for (int i=0; i<romanNumber.length(); i++) {
            char curr_Char = romanNumber.charAt(i);
            int curr_Val = getDecimalValue(curr_Char);

            if(i + 1 < romanNumber.length() &&  getDecimalValue(romanNumber.charAt(i+1))>curr_Val){
                result -= curr_Val;
            }else{
                result += curr_Val;
            }
        }
        return result;
    }


    //function for provide decimal value of asked roman character
    public static int getDecimalValue(char ch){
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            case 'i':
                return 1;
            case 'v':
                return 5;
            case 'x':
                return 10;
            case 'l':
                return 50;
            case 'c':
                return 100;
            case 'd':
                return 500;
            case 'm':
                return 1000;
            default :
                return 0;
        }
    }
}
