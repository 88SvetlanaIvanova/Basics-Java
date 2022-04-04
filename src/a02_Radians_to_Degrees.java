import  java.util.Scanner;
public class a02_Radians_to_Degrees {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radians = Double.parseDouble(scan.nextLine());
        /*
         Използвайте формулата: градус = радиан * 180 / π.Числото π
         в Java програми е достъпно чрез Math.PI.
         Закръглете резултата до най-близкото цяло число използвайки "%.0f".
         */
        double degrees = radians * 180/Math.PI;
        System.out.printf("%.0f", degrees);

    }
}
