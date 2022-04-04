import java.util.Scanner;
public class a04_vacationBookList {
    public static void main(String[] args) {
        /*
От конзолата се четат 3 реда:
1.	Брой страници в текущата книга – цяло число в интервала [1…1000];
2.	Страници, които може да прочита за 1 час – цяло число в интервала [1…1000];
3.	Броя на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000];
. изчисляваме общото време за четене на книгата: 212 / 20 = 10 часа
. получения резултат делим на броя дни, за да получим необходимите
часове на ден: 10 часа / 2 дни = 5 часа на ден
         */
        Scanner scan = new Scanner(System.in);
        int pagesNum = Integer.parseInt(scan.nextLine());
        int pagesHourly = Integer.parseInt(scan.nextLine());
        int numOfDays = Integer.parseInt(scan.nextLine());
        int timeReading = (pagesNum/pagesHourly)/numOfDays;
        System.out.println(timeReading);


    }
}
