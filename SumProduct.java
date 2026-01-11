import java.util.Scanner;
public class SumProduct {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // input number
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        // Sum and product of the digits of number.
        int sum = 0;
        int product = 1;
        if (num == 0) {
            product = 0;
        }
        while (num != 0){
            int r = num % 10;   
            // sum of digits
            sum += r;
            // product of digits
            product *= r;
            num /= 10;
        }
        // subtraction of sum and product of digits of number.
        int answer = sum - product;
        System.out.println("subtraction of sum and product of digits of number = " + answer);
    }
}