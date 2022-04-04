import  java.util.Scanner;

public class y07Yard_Greening {
    public static void main(String[] args) {
        /*
        От конзолата се прочита само един ред:
        Кв. метри, които ще бъдат озеленени – реално число в интервала [0.00… 10000.00]
        Пресмятаме цената за озеленяване на целия двор:
        550 * 7.61 = 4185.5 лв.
        Приспадаме отстъпката от общата сума:
        0.18 * 4185.5 = 753.39 лв.
        Калкулираме крайната цена на услугата:
        4185.5 – 753.39  3432.11 лв.

         */
        Scanner console = new Scanner(System.in);
        double cubMeters = Double.parseDouble(console.nextLine());
        double greenPrice = cubMeters * 7.61;
        double greenPriceDiscount = greenPrice * 0.18;
        double finalPrice = greenPrice - greenPriceDiscount;

        System.out.printf("The final price is: %.2f lv.\n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", greenPriceDiscount);

    }
}
