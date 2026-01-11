import java.util.Scanner;
public class Simple_intrest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\n==============================\nSimple Intrest...\n");
        System.out.print("Enter the Principal Amount: ");
        double p = input.nextDouble();

        System.out.print("\nEnter the Rate of intrest: ");
        double r = input.nextDouble();

        System.out.print("\nEnter the Time(in year): " );
        double t = input.nextDouble();

        double intrest = (p * r * t) / 100;
        System.out.println("\nSimple Intrest = "+ intrest);
        System.out.println("\nTotal Amount = " + (intrest + p) + "\n==============================\n");
        input.close();
    }
}