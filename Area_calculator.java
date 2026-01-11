import java.util.Scanner;
public class Area_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pass = 1;
        while (pass == 1) {
            System.out.println("Find the Area?");
            System.out.println("1.Triangle");
            System.out.println("2.Square");
            System.out.println("3.Rectangle");
            System.out.println("4.Circle");
            System.out.println("5.Trapzium");
            System.out.println("0. Exit...");
            System.out.println("Please ensure that you have enter the correct option...");
            System.out.print("Option: ");
            int choice = input.nextInt();
            System.out.println(" ");

            if (choice >= 1 && choice <= 5) {
                double area;
                // Area of Triangle
                if (choice == 1) {
                    System.out.println("Area of Triangle\n");
                    System.out.print("length: ");
                    float length = input.nextFloat();
                    System.out.print("Breath: ");
                    float breath = input.nextFloat();
                    area = 0.5 * length * breath;
                    System.out.println("\nArea: " + area);
                }
                // Area of square
                else if (choice == 2) {
                    System.out.println("Area of Square\n");
                    System.out.print("Side: ");
                    float side = input.nextFloat();
                    area = side * side;
                    System.out.println("\nArea: " + area);
                }
                // Area of Rectangle
                else if (choice == 3) {
                    System.out.println("Area of Rectangle\n");
                    System.out.print("length: ");
                    float length = input.nextFloat();
                    System.out.print("Breath: ");
                    float breath = input.nextFloat();
                    area = length * breath;
                    System.out.println("\nArea: " + area);
                }

                // Area of Circle
                else if (choice == 4) {
                    System.out.println("Area of Circle\n");
                    System.out.print("Radius: ");
                    float r = input.nextFloat();
                    area = 3.14 * r * r;
                    System.out.println("\nArea: " + area);
                }
                // Area of Trapzium
                else if (choice == 5) {
                    System.out.println("Area of Trapzium\n");
                    System.out.print("Distance b/w parallel side: ");
                    float height = input.nextFloat();
                    System.out.print("1st parallel side: ");
                    float line1 = input.nextFloat();
                    System.out.print("2nd parallel side: ");
                    float line2 = input.nextFloat();
                    area = 0.5 * (line1 + line2) * height;
                    System.out.println("\nArea: " + area);
                }
            }
            else {
                if (choice == 0) {
                    System.out.println("\nEnding the program...");
                    pass = 0;
                }
                else {
                    System.out.println("\nInvalid Choice...");
                }

            }
            System.out.println("\n==============================================\n");

        }
        input.close();
    }
}