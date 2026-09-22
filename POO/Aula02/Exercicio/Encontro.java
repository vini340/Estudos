package Exercicio;

public class Encontro {
    public static void main(String[] args) {
        Molde c1 = new Molde();
        c1.Data = "10/10/2026";
        c1.Hora = "15:00";
        c1.Local = "Shopping Iguatemi";
        c1.Tipo = "Um encontro romântico";
        c1.Vestimenta = "Algo mais formal que se encaixe em um encontro";
        c1.status();
        c1.adiado();
        c1.deuCerto();
    }
}
