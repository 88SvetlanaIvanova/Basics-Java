import java.util.Scanner;
public class a07_FruitMarket_hard {
    public static void main(String[] args) {
        /*
        На конзолата се въвежда цената на ягодите в лв./кг. и количеството на бананите,
         портокалите, малините и ягодите, които трябва да закупи. Да се напише програма,
         която пресмята колко пари са ѝ необходими, за да плати сметката, като знаете, че:
•	цената на малините е с 50% по-ниска от тази на ягодите;
•	цената на портокалите е с 40% по-ниска от цената на малините;
•	цената на бананите е с 80% по-ниска от цената на малините.
Вход
От конзолата се четат 5 реда:
1.	Цена на ягодите в лева – реално число в интервала [0.00 … 10000.00]
2.	Количеството бананите в килограми – реално число в интервала [0.00 … 10000.00]
3.	Количеството портокалите в килограми – реално число в интервала [0.00 … 10000.00]
4.	Количеството малините в килограми – реално число в интервала [0.00 … 10000.00]
5.	Количеството ягодите в килограми – реално число в интервала [0.00 … 10000.00]
Изход
Да се отпечата на конзолата едно число:
•	парите, които са необходими на Мария.
Ресултатът да се форматира до вторта цифра след десетичната запетая.

         */
        Scanner scan = new Scanner(System.in);
        double strawberryPrice = Double.parseDouble(scan.nextLine());
        double bananaWeight = Double.parseDouble(scan.nextLine());
        double orangeWeight = Double.parseDouble(scan.nextLine());
        double raspberryWeight = Double.parseDouble(scan.nextLine());
        double strawberryWeight = Double.parseDouble(scan.nextLine());
        double strawberrySum = strawberryPrice*strawberryWeight;
        double raspberryPrice = strawberryPrice/2;
        double bananaPrice = raspberryPrice -  raspberryPrice * 0.8;
        double orangePrice = raspberryPrice - raspberryPrice* 0.4;
        double totalPrice = (strawberrySum)+(bananaPrice*bananaWeight)+
                (raspberryPrice * raspberryWeight) +
                (orangePrice * orangeWeight);
        System.out.printf("%.2f",totalPrice);


    }
}
