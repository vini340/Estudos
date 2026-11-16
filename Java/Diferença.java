package Java;

import java.util.Scanner;

public class Diferença {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String nome1 = scanner.nextLine();
        
        System.out.println("Qual o seu nome? ");
        String nome2 = scanner.nextLine();

        System.out.println("Qual a sua idade " + nome1 + "?");
        int idade1 = scanner.nextInt();

        System.out.println("Qual a sua idade " + nome2 + "?");
        int idade2 = scanner.nextInt();

        int diferença = idade1 - idade2;

        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é: " + diferença);

    }
}
