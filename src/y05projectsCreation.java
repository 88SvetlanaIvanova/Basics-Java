import java.util.Scanner;
public class y05projectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  archName = scan.nextLine();


        int numProjects = Integer.parseInt(scan.nextLine());
        int hours = numProjects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.",
                archName, hours,numProjects);
    }
}
