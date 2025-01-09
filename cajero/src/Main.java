import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in); //Variable global

    /**
     * Muestra la bienvenida al programa
     * @return String, bienvenida
     */
    public static String bienvenida(){
        return "----------------------------------------\n" +
                "       ATM CAJERO AUTOMÁTICO\n" +
                "---------------------------------------";
    }

    /**
     * Método muestra el menú principal del programa
     * @param opcion Opción a la que accedemos.
     * @return numero al que pertenece la opción.
     */

    public static int menuPrincipal(int opcion){
        switch(opcion){
            case 0://Acceso usuario
                return 1;
            case 1://Consultar cuenta
                return 2;
            case 2://Depositar dinero
                return 3;
            case 3://Retirar dinero
                return 4;
            case 4://Otros movimientos
                return 5;
            case 5://Cerrar sesión
                return 6;
            default:
                System.out.println("Opción no valida (0-5)");
                return -1;
        }
    }

    public static boolean numValido(int num){
        if(num >= 0 && num <= 5){
            return false;
        }else {
            return true;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(bienvenida());
        boolean salir = false;
        do{
            System.out.println();
            System.out.println("--------MENU--------");
            System.out.println("0. Acceso Usuario");
            System.out.println("1. Consultar Cuenta");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Otros movimientos");
            System.out.println("5. Cerrar Sesión");
            System.out.print("Elige una de la opciones (0-5) -> ");
            int opcion = sc.nextInt();

            salir = numValido(opcion);
        }while (salir);
    }
}