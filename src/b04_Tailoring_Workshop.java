import java.util.Scanner;
public class b04_Tailoring_Workshop {
    public static void main(String[] args) {
        /*
        Напишете програма, която пресмята цената на поръчка в долари и в левове,
        като квадратен метър плат за правоъгълна покривка струва 7 долара,
        а за каре – 9 долара. Курсът на долара е 1.85 лева.
Вход
Потребителят въвежда 3 числа, по едно на ред:
•	Брой правоъгълни маси – цяло число в интервала [0...500]
•	Дължина на правоъгълните маси в метри – реално число в интервала [0.00...3.00]
•	Широчина на правоъгълните маси в метри – реално число в интервала [0.00...3.00]
Изход
Да се отпечатат на конзолата две числа: цената на изделията в долари и в левове.
o	"{цена в долари} USD"
o	"{цена в левове} BGN"
Резултатите да се закръглят до два знака след  десетичната запетая.

         */
        Scanner scan = new Scanner(System.in);
        int tablesNum = Integer.parseInt(scan.nextLine());
        double rectangleTableLength = Double.parseDouble(scan.nextLine());
        double rectangleTableWidth = Double.parseDouble(scan.nextLine());
        double areaTablecloth = tablesNum * ((rectangleTableLength + 0.30*2)*
                (rectangleTableWidth + 0.30*2));
        double areaTishleifer = tablesNum * (rectangleTableLength/2)* (rectangleTableLength/2);
        double priceUSD = areaTablecloth * 7 + areaTishleifer*9;
        double priceBGN = priceUSD * 1.85;
        //"{цена в долари} USD"


        System.out.printf("%.2f", priceUSD);
        System.out.println(" USD");
        System.out.printf("%.2f", priceBGN);
        System.out.println(" BGN");



    }
}
