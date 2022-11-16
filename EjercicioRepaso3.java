import java.util.Scanner;

//SI QUIERES QUE SE REPITA DENTRO DE UN DO-WHIILE

public class EjercicioRepaso3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la altura de la pirámide: ");
        int altura = sc.nextInt();
        System.out.print("Dime la figura que quieres de la pirámide: ");
        String figura = sc.next();

        System.out.println("Dime la orientación:");
        System.out.println("1) Arriba");
        System.out.println("2) Abajo");
        System.out.println("3) Derecha");
        System.out.println("4) Izquierda");
        System.out.print("Orientación deseada: ");
        int orientacion = sc.nextInt();

        if(orientacion<1 || orientacion>4){
            System.out.println("ERROR!, Reinicie el programa e ingrese bien los datos");
        }

        switch (orientacion) {
            case 1: //Pirámide normal

                for(int i = 1;i<=altura;i++){ //Altura total de la pirámide
                    for(int espacioslat = altura-i; espacioslat>=0;espacioslat--){
                        System.out.print(" ");
                    }
                    for(int asteriscos = 1;asteriscos<=(2*i)-1;asteriscos++){
                        System.out.print(figura);
                    }
                    System.out.println();
                }

            break;

            case 2: //Pirámide invertida

            for(int i = altura ; i>=1 ; i--){ //Altura total de la pirámide invertida del total a 1
                for(int espacioslat = altura-i; espacioslat>=0;espacioslat--){
                    System.out.print(" ");
                }
                for(int asteriscos = 1;asteriscos<=(2*i)-1;asteriscos++){
                    System.out.print(figura);
                }
                System.out.println();
            }

            break;

            case 3: //Derecha

            for(int i = 1;i<=altura-1;i++){ //Altura media de la pirámide menos 1 para hacer por separado la línea del medio que tiene la misma longitud que altura
                for(int espacioslat = -1; espacioslat>=0;espacioslat--){
                    System.out.print(" ");
                }
                for(int asteriscos = 1 ;asteriscos<=i;asteriscos++){
                    System.out.print(figura);
                }
                System.out.println();
            }

            for(int asteriscos = 1 ;asteriscos<=altura;asteriscos++){ //Sabemos que la altura del medio es igual a la altura
                System.out.print(figura);
            }
            System.out.println();

            for(int i = altura-1 ;i>=1;i--){ 
                for(int espacioslat = -1; espacioslat>=0;espacioslat--){
                    System.out.print(" ");
                }
                for(int asteriscos = 1 ;asteriscos<=i;asteriscos++){
                    System.out.print(figura);
                }
                System.out.println();
            }

            break;

            case 4: //Izquierda
            for(int i = 1;i<=altura-1;i++){ //Altura media de la pirámide menos 1 para hacer por separado la línea del medio que tiene la misma longitud que altura
                for(int espacioslat = altura-i; espacioslat>=1;espacioslat--){
                    System.out.print(" ");
                }
                for(int asteriscos = 1 ;asteriscos<=i;asteriscos++){
                    System.out.print(figura);
                }
                System.out.println();
            }

            for(int asteriscos = 1 ;asteriscos<=altura;asteriscos++){ //Sabemos que la altura del medio es igual a la altura
                System.out.print(figura);
            }
            System.out.println();

            for(int i = altura-1 ;i>=1;i--){ 
                for(int espacioslat = altura-i; espacioslat>=1;espacioslat--){
                    System.out.print(" ");
                }
                for(int asteriscos = 1 ;asteriscos<=i;asteriscos++){
                    System.out.print(figura);
                }
                System.out.println();
            }
            break;

            default:
            break;
        }
        sc.close();
    }
}
