import java.util.Scanner;
public class a06_charityCampaign_hard {
    public static void main(String[] args) {
/*
Вход
От конзолата се четат 5 реда:
1.	Броят на дните, в които тече кампанията – цяло число в интервала [0 … 365]
2.	Броят на сладкарите – цяло число в интервала [0 … 1000]
3.	Броят на тортите – цяло число в интервала [0… 2000]
4.	Броят на гофретите – цяло число в интервала [0 … 2000]
5.	Броят на палачинките – цяло число в интервала [0 … 2000]
Изход
Да се отпечата на конзолата едно число:
•	парите, които са събрани.
Ресултатът да се форматира до вторта цифра след десетичната запетая.
•	Торта - 45 лв.
•	Гофрета - 5.80 лв.
•	Палачинка - 3.20 лв.
Изчисляваме сумата, която се изкарва на ден за всеки един от продуктите, направени от 1 сладкар:
Торти: 14 * 45 = 630 лв.;
Гофрети: 30 * 5.80 = 174 лв.;
Палачинки: 16 * 3.20 = 51.20 лв.
Обща сума за един ден от всички сладкари: (630 + 174 + 51.20) * 8 = 6841.60 лв.
Сума събрана от цялата кампания: 6841.60 * 23 = 157356.8лв.
Сума след покриване на разходите: 157356.8 - 1/8 от 157356.8 = 137687.2 лв.

 */
        Scanner scan = new Scanner(System.in);
        int daysCharity = Integer.parseInt(scan.nextLine());
        int numberOfChefs = Integer.parseInt(scan.nextLine());
        int cakesNum = Integer.parseInt(scan.nextLine());
        int wafflesNum = Integer.parseInt(scan.nextLine());
        int pancakesNum = Integer.parseInt(scan.nextLine());
        double cakeCost = cakesNum * 45;
        double wafflesCost = wafflesNum * 5.80;
        double pancakesCost = pancakesNum * 3.20;
        double wholeSum = daysCharity * (numberOfChefs * (cakeCost  + wafflesCost + pancakesCost));
        double totalSum = wholeSum - (wholeSum/8);

        System.out.printf("%.2f",totalSum);


    }


}
