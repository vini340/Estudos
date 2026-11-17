package Java;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para ver a sua tabuada: ");
        int number1 = scanner.nextInt();
        int multiplicador = 0;
        int resultado = 0;
        while (number1 >= 0 && multiplicador < 10){
            multiplicador++;
            resultado = number1 * multiplicador;
            System.out.println(number1 + " x " + multiplicador + " = " + resultado);
        }
    }
}
