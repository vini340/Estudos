package Java;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int number1 = scanner.nextInt();
        System.out.println("Digite outro numero maior que o primeiro: ");
        int number2 = scanner.nextInt();
        System.out.println("Voce quer os numeros pares ou os impares? ");
        String escolha = scanner.next();
        switch (escolha) {
            case "pares":
                for (int i = number1; i <= number2; i++){
                    if (i % 2 == 0){
                        System.out.println(i);
                    }
                }
                break;
            case "impares":    
                for(int i = number1; i <= number2; i++){
                    if (i % 2 != 0){
                        System.out.println(i);
                    }
                }
            default:
                break;
        }
    }
}
