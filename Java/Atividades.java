package Java;
import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("Em que ano voce nasceu? ");
        int anoNascimento = scanner.nextInt();
        System.out.println("Qual o ano atual? ");
        int anoAtual = scanner.nextInt();
        int idade = anoAtual - anoNascimento;
        System.out.println("Olá " + nome + ", voce tem " + idade + " anos.");
    }
}
