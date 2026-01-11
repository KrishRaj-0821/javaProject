import java.util.Scanner;
public class Currency_exchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("..........Money Exchange...........");
        System.out.println("===================================");

        final double  INR = 1;
        final double USD = 0.011;
        final double NP = 1.60;

        boolean run = true;
        while (run){
            System.out.println("Choose the Currency You Want to Covert: ");
            System.out.println("1. INR");
            System.out.println("2. USD");
            System.out.println("3. Nepali Rupees");
            System.out.println("0. Exit");

            System.out.print("Choice: ");
            int choice = input.nextInt();

            if (choice == 0) {
                System.out.print("Program Ended...\nThank you for using Currency Exchange.");
                break;
            }
            System.out.print("\nEnter the Amount you want to convert: ");
            double Amount = input.nextDouble();
        // Converted into INR
            double converted_in_inr = 0.0;
            String entered_currency = "null";
            String converted_currency = "null";
            switch(choice) {
                case 1:
                    converted_in_inr = Amount / INR;
                    entered_currency = "INR";
                    break;
                case 2:
                    converted_in_inr = Amount / USD;
                    entered_currency = "USD";
                    break;
                case 3:
                    converted_in_inr = Amount / NP;
                    entered_currency = "Nepali Rupees";
                    break;
                default:
                    System.out.println("\nInvalid Choice...");
            }
    // Currency Exchange
            System.out.println("\nChoose the Currency You Want to Coverted into: ");
            System.out.println("1. INR");
            System.out.println("2. USD");
            System.out.println("3. Nepali Rupees");

            int option = input.nextInt();
            double finalAmount = 0.0;
            switch(option) {
                case 1:
                    finalAmount = converted_in_inr * INR;
                    converted_currency = "INR";
                    break;
                case 2:
                    finalAmount = converted_in_inr * USD;
                    converted_currency = "USD";
                    break;
                case 3:
                    finalAmount = converted_in_inr * NP;
                    converted_currency = "Nepali Rupee";
                    break;
                default:
                    System.out.println("\nInvalid Choice...");
            }
            System.out.printf("\n %.2f %s  =====>  %.2f %s\n",Amount, entered_currency, finalAmount, converted_currency);
            System.out.println("===================================");
        }
        
        input.close();
    }   
}