package Java;

import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        if (imc <= 18.5){
            System.out.println("Abaixo do peso");
        }else if (imc > 18.5 && imc <= 24.9){
            System.out.println("Peso normal");
        }else if (imc > 24.9 && imc <= 29.9){
            System.out.println("Sobrepeso");
        }else if (imc > 29.9 && imc <= 34.9){
            System.out.println("Obesidade grau 1");
        }else if (imc > 34.9 && imc <= 39.9){
            System.out.println("Obesidade grau 2");
        }else {
            System.out.println("Obesidade grau 3");
        }
    }
}
