import  java.util.Scanner;

public class y06PetShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numDogs = Integer.parseInt(console.nextLine());
        int numOtherAnimals = Integer.parseInt(console.nextLine());

        double totalSum = (numDogs * 2.50) + (numOtherAnimals * 4);


        System.out.printf("%.2f", totalSum);
        System.out.println(" lv.");


    }
}