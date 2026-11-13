package Java;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.println("Digeti seu segundo número:");
        double num2 = scanner.nextDouble();
        System.out.println("Qual operação voce quer + | - | * | / ?");
        String operação = scanner.next();
        double resultado = 0;
        switch (operação) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }
        System.out.println("Resultado: " + resultado);
    }
}
