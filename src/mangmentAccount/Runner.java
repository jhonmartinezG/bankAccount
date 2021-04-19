package mangmentAccount;

import java.util.Scanner;

public class Runner {

    public static boolean exit = true;
    static Scanner scanner = new Scanner(System.in);
    public static int option;

    public static void main(String[] args) {

        Account account = new Account();

        System.out.println("Por favor, ingrese el nombre de la persona titular de la cuenta");
        String name = scanner.next();
        account.addName(name);

        while (exit) {
            System.out.println("Ingrese 1 para añadir dinero");
            System.out.println("Ingrese 2 para retirar dinero");
            System.out.println("Ingrese 3 para mostrar el saldo actual");
            System.out.println("Ingrese 4 para salir");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingrese el valor de desea agregar");
                    float valueEntered = scanner.nextFloat();
                    account.addMoney(valueEntered);
                    break;
                case 2:
                    System.out.println("Ingrese el valor de desea retirar");
                    float valueEnteredRetrieve = scanner.nextFloat();
                    account.retrieveMoney(valueEnteredRetrieve);
                    break;
                case 3:
                    account.showCurrentAmount();
                    break;
                case 4:
                    exit = false;
                    break;
            }

        }

    }

}
