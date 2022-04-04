import java.util.Scanner;
public class a05_birthdayParty {
    public static void main(String[] args) {
        /*
        Напишете програма, с която да помогнете на Людмила да изчисли какъв бюджет ще ѝ бъде
        необходим, като имате следната информация за допълнителните неща, необходими за
        тържеството:
•	Торта  – цената ѝ е 20% от наема на залата
•	Напитки – цената им е 45% по-малко от тази на тортата
•	Аниматор – цената му е 1/3 от цената за наема на залата
Вход
От конзолата се четe 1 ред:
•	Наем за залата – цяло число в интервала [100..10000]
Изход
Да се отпечата на конзолата какъв бюджет ще бъде необходим за организиране на тържеството.
         */
        Scanner scan = new Scanner(System.in);
        int reservationHall = Integer.parseInt(scan.nextLine());
        double cakeCost = reservationHall * 0.2;
        double drinksCost = cakeCost * 0.55;
        double animatorCost = reservationHall/3;
        double totalCost = reservationHall + cakeCost + drinksCost + animatorCost;
        System.out.printf("%.1f",totalCost);



    }
}
