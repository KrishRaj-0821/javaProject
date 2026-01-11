import java.util.Scanner;
public class table {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to display its multiplication table: ");
        int num = input.nextInt();
    	System.out.println("Table of " + num);
        // While loop implementation

        // int count = 1;
        // while (count <= 10) {
        // 	int table = num * count;
        //     System.out.println(num + " x " + count + " = " + table);
        //     count++;
        // }

        // for loop implementation
        for (int count = 1; count <= 10 ; count++){
            int table = num * count;
            System.out.println(num + " X " + count + " = " + table);
        }
    }
}