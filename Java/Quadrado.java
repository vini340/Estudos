package Java;
import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite qual o tamanho de um lado do quadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.println("A area do quadrado é: " + area);
    }
}
