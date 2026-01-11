import java.util.Scanner;
public class ElectricBillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n==============================================");
        System.out.println(":::::      Electric Bill Calculator      :::::");
        System.out.println("==============================================");

        System.out.print("No. of Appliance: ");
        int No = input.nextInt();
        
        double TotalEnergyConsumption = 0;
        double EnergyConsumption = 0;
        while (No != 0) {
            input.nextLine();
            // Electric component name
            System.out.print("\nName of Appliance:");
            String appliance = input.nextLine();

            // no. of same device
            System.out.print("No. of " + appliance + " in a Home: ");
            int No_of_Device = input.nextInt();

            // Power consumption
            System.out.print("\nPower consumption:");
            double power = input.nextDouble();

            // unit
            while (true) {
                System.out.println("\nUnit:");
                System.out.println("1. Watt");
                System.out.println("2. Kilo-Watt");
                
                System.out.print("Choice: ");
                int Unit = input.nextInt();

                // Hours of use per day:
                System.out.print("Hours of use per day: ");
                double Time = input.nextDouble();

                // Energy consumption calculation
                // E(kWh/day) = P(W) × t(h/day) / 1000(W/kW)
                if (Unit == 1) {
                    EnergyConsumption = (power * Time ) / 1000;
                    break;
                }
                else if (Unit == 2) {
                    EnergyConsumption = (power * Time );
                    break;
                }
                else {
                    System.out.println("\nInvalid Choice of Unit...");
                }
            }
            TotalEnergyConsumption = TotalEnergyConsumption + (EnergyConsumption * No_of_Device);
            System.out.println("............................................");
            No--;
        }
    
        // Costing...
        System.out.print("Per Unit Cost: ");
        double CostPerUnit = input.nextDouble();

        // Total cost
        double TotalCost = CostPerUnit * TotalEnergyConsumption;

        System.out.printf("\nCost Per Day: Rs %.2f", TotalCost);
        System.out.printf("\nCost Per Month: Rs %.2f", (TotalCost * 30));
        
        System.out.println("\n==============================================\n");
        
        input.close();
    }
}