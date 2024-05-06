import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double primNumUser = 0;
        double segNumUser = 0;
        boolean validador = false;

        while (!validador) {
            try {
                System.out.print("Digite o primeiro numero: ");
                primNumUser = scanner.nextDouble();
                validador = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite numero com [,] para decimais");
                scanner.next();
            }
        }

        validador = false;

        while (!validador) {
            try {
                System.out.print("Digite o segundo numero: ");
                segNumUser = scanner.nextDouble();
                validador = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite numero com [,] para decimais");
                scanner.next();
            }
        }

        System.out.println("Digite uma das opções abaixo ...\n[1] - SOMAR\n[2] - SUBTRAIR\n[3] - DIVIDIR\n[4] - MULTIPLICAR");
        int opcaoUsuario = scanner.nextInt();

        double resultado = 0;

        switch (opcaoUsuario) {
            case 1:
                resultado = primNumUser + segNumUser;
                System.out.println("Resultado da soma foi: " + resultado);
                break;
            case 2:
                resultado = primNumUser - segNumUser;
                System.out.println("Resultado da subtração foi: " + resultado);
                break;

            case 3: resultado = primNumUser + segNumUser;
                System.out.println("Por quanto quer dividir o numero: " + resultado);
                Scanner divirNumScanner = new Scanner(System.in);
                double divirNumUser = divirNumScanner.nextDouble();
                double resultadoDivisao = resultado / divirNumUser;
                System.out.printf("Resultado da [divisão] foi : " + resultadoDivisao);
                break;

            case 4:
                resultado = primNumUser * segNumUser;
                System.out.println("Resultado da multiplicação foi: " + resultado);
                break;

            default:
                System.out.println("Opção inválida, por favor, digite apenas uma das opções visíveis.");
                break;
        }
    }
}