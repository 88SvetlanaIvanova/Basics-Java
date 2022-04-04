import java.util.Scanner;
public class y01GreetingByName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  name = scan.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
