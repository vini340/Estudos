package Java;
import java.util.Scanner;

public class Rep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Poderia digitar um numero: ");
        int number = scanner.nextInt();
        System.out.println("Poderia digitar outro numero: ");
        int number2 = scanner.nextInt();
        while(number % number2 != 0){
            System.out.println("Esses dois numeros nao sao divisores");
            System.out.println("Poderia escrever outro numero: ");
            number2 = scanner.nextInt();
        }
        System.out.println("Os numeros sao divisiveis");
    }
}
