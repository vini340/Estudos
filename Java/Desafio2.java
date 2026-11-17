package Java;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String codigoInformado = scanner.nextLine();
        String codigoEsperado = scanner.nextLine();
        
        Boolean acesso;
        
        if(codigoInformado.equals(codigoEsperado)){
          acesso = true;
        }else{
          acesso = false;
        }
        
        System.out.println(acesso ? "ACESSO LIBERADO" : "ACESSO NEGADO");

        // Compare os dois textos exatamente como foram lidos.
        // Se forem identicos, exiba "ACESSO LIBERADO"; caso contrario, "ACESSO NEGADO".
        // TODO: imprima o resultado da validacao em uma unica linha.

        scanner.close();
    }
}