import java.util.Scanner;
public class b07_Alcohol_Market {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double whiskeyPrice = Double.parseDouble(scan.nextLine());
        double beerLitres = Double.parseDouble(scan.nextLine());
        double wineLitres = Double.parseDouble(scan.nextLine());
        double vodkaLiters = Double.parseDouble(scan.nextLine());
        double whiskeyLitres = Double.parseDouble(scan.nextLine());
        double vodkaPrice = whiskeyPrice/2;
        double winePrice = vodkaPrice * 0.60;
        double beerPrice = vodkaPrice * 0.20;
        double Sum = (whiskeyPrice * whiskeyLitres)+
                (beerPrice * beerLitres)+
                (winePrice * wineLitres)+
                (vodkaPrice * vodkaLiters);
        System.out.printf("%.2f%n", Sum);


    }
}
