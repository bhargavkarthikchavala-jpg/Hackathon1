import java.util.Scanner;

public class Household1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of family members (integer): ");
        int familyMembers = scanner.nextInt();
         System.out.print("Enter water consumed in litres (decimal value): ");
        double waterConsumed = scanner.nextDouble();
         System.out.print("Enter house number (integer): ");
        int houseNumber = scanner.nextInt();
        System.out.print("Enter water usage status (character):(Y/N) ");
        char waterUsageStatus = scanner.next().charAt(0);
         System.out.println("Household Details");
        System.out.println("Number of family members: " + familyMembers);
        System.out.println("Water consumed: " + waterConsumed + " litres");
        System.out.println("House number: " + houseNumber);
        System.out.println("Water usage status: " + waterUsageStatus);

        scanner.close();
    }
}