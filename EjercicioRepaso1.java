import java.util.Scanner;
public class EjercicioRepaso1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce la altura: ");
        int altura = sc.nextInt();
        for (int i = 0; i <= altura + 1; i++) {
            String line = "";
            if (i == 0 || i == altura + 1) {
                for (int j = 0; j < (altura * 2 + 3); j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < (i * 2 - 1); j++) {
                    line += "*";
                }
                System.out.printf("*%" + (altura - i + 1) + "s%s%" + (altura - i + 1) + "s*", "", line, "");
            }
            System.out.println();
        }
        sc.close();
    }
}
