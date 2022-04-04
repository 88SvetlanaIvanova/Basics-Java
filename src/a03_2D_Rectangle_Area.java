import  java.util.Scanner;
public class a03_2D_Rectangle_Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        /*
       	Намерете дължината и широчината на правоъгълника,
        за да намерите след това лицето и периметъра.
        Създайте две променливи, в първата ще изчислявате
        дължината, а във втората широчината. Разликата
        между координатите х1 и х2 ще ви даде дължината
        на правоъгълника, а разликата между координатите
        у1 и у2 ще ви даде широчината.
        Използвайте Math.abs (абсолютна стойност) и
        вземете абсолютната стойност на разликата от
        коордиантите, за да бъдат дължината и
        широчината на правоъгълника положителни числа.
         */
        double length = Math.abs(x1 -x2);
        double width = Math.abs(y1 -y2);
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.printf("%.2f%n", area);
        System.out.printf("%.2f", perimeter);


    }
}
