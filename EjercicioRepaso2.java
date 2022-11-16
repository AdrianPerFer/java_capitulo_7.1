import java.util.Scanner;
public class EjercicioRepaso2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura: ");
        int altura = sc.nextInt();
        for (int i = 0; i <= altura * 2; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j <= altura - i; j++) {
                if (j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            for (int j = altura - i; j >= 0 ; j--) {
                if ( j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i <= altura * 2; i++) {
            System.out.print("*");
        }
        sc.close();
    }
}