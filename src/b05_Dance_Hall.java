import java.util.Scanner;
public class b05_Dance_Hall {
    public static void main(String[] args) {
/*
От конзолата се четат 3 реда:
1.	L – дължина на залата в метри – реално число в интервала  [10.00 … 100.00]
2.	W – ширина на залата в метри – реално число в интервала  [10.00 … 100.00]
3.	А – страна на гардероба в метри – реално число в интервала [2.00… 20.00]
Мястото, което заема един танцьор е 40 см² и допълнително за свободно движение му трябват още
7000см².
Напишете програма, която да изчислява колко танцьори могат да се поберат в залата и да се движат
свободно. Полученият резултат трябва да се закръгли до най-близкото цяло число надолу.

 */
        Scanner scan = new Scanner(System.in);
        double hallLength = Double.parseDouble(scan.nextLine());
        double hallWidth = Double.parseDouble(scan.nextLine());
        double changeroomSide = Double.parseDouble(scan.nextLine());
        double hallSize = (hallLength*100)*(hallWidth*100);
        double changeroomSize = (100*changeroomSide) * (changeroomSide*100);
        double benchSize = hallSize/10;
        double spaceToDance = hallSize - changeroomSize - benchSize;
        double numOfDancers = spaceToDance / (40 + 7000);
        System.out.printf("%.0f%n", Math.floor(numOfDancers));



    }
}
