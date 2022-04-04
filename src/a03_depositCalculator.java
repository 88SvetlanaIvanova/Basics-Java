import java.util.Scanner;
public class a03_depositCalculator {
    public static void main(String[] args) {
        /*
        Напишете програма, която изчислява каква сума ще получите в края на депозитния период
        при определен лихвен процент. Използвайте следната формула:
сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
От конзолата се четат 3 реда:
1.	Депозирана сума – реално число в интервала [100.00 … 10000.00];
2.	Срок на депозита(в месеци) – цяло число в интервала [1…12];
3.	Годишен лихвен процент – реално число в интервала [0.00 …100.00];

         */
        Scanner scan = new Scanner(System.in);
        double depositSum = Double.parseDouble(scan.nextLine());
        int monthNum = Integer.parseInt(scan.nextLine());
        double percentPerYear = Double.parseDouble(scan.nextLine());
        double percentage = percentPerYear * 0.01;

        double totalSum = depositSum + monthNum * ((depositSum * percentage) / 12);
        System.out.printf("%.2f",totalSum);


    }
}
