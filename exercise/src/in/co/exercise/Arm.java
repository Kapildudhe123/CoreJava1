package in.co.exercise;


public class Arm{

public static void main(String[] args) {
    for (int number = 100; number <= 10000; number++) {
        int originalNumber = number;
        int result = 0;
        int digits = String.valueOf(number).length();
        
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }
        
        if (result == number) {
            System.out.print(number + " ");
        }
    }
}
}