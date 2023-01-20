import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de lengte in ");
        double lengte = scanner.nextDouble();
        System.out.println("Geef de breedte in ");
        double breedte = scanner.nextDouble();

        double resultaatOppervlakte;
        resultaatOppervlakte = lengte * breedte;
        System.out.println("de oppervlakte is "+ resultaatOppervlakte);

        double resultaatOmtrek;
        resultaatOmtrek = 2 * lengte + 2 * breedte;
        System.out.println("de omtrek is " + resultaatOmtrek);





    }

}