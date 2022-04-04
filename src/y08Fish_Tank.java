import  java.util.Scanner;

public class y08Fish_Tank {
    public static void main(String[] args) {
        /*
        За рождения си ден Любомир получил аквариум с формата на паралелепипед. Първоначално прочитаме от конзолата на отделни редове размерите му – дължина, широчина и височина в сантиметри. Трябва да се пресметне колко литра вода ще събира аквариума, ако се знае, че определен процент от вместимостта му е заета от пясък, растения, нагревател и помпа.
Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм3/.
Да се напише програма, която изчислява литрите вода, която са необходими за напълването на аквариума.
Вход
От конзолата се четат 4 реда:
1.	Дължина в см – цяло число в интервала [10 … 500]
2.	Широчина в см – цяло число в интервала [10 … 300]
3.	Височина в см – цяло число в интервала [10… 200]
4.	Процент  – реално число в интервала [0.000 … 100.000]
Изход
Да се отпечата на конзолата едно число:

         */
        Scanner console = new Scanner(System.in);
        int length = Integer.parseInt(console.nextLine());
        int height = Integer.parseInt(console.nextLine());
        int width = Integer.parseInt(console.nextLine());
        double percentage = Double.parseDouble(console.nextLine());
        double volume = length*width*height;
        double litTotal = volume * 0.001;
        double thePercent = percentage * 0.01;
        double litNeeded = litTotal * (1 - thePercent);
        System.out.printf(" %.3f", litNeeded);


    }
}
