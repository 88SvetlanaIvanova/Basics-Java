import  java.util.Scanner;
public class y04FromInchToSm {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = Double.parseDouble(console.nextLine());
        double inch = a * 2.54;
        System.out.println(inch);

    }
}
