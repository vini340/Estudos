package POO.Aula05;

public class Conta {
    public static void main(String[] args) {
        Corrente c1 = new Corrente();
        c1.setNumConta(4444);
        c1.setDono("Vinicius");
        c1.abrirConta("CP");
        c1.depositar(600f);
        c1.Mostrar();

        Corrente c2 = new Corrente();
        c2.setNumConta(9999);
        c2.setDono("Marcia");
        c2.abrirConta("CC");
        c2.depositar(670f);
        c2.Mostrar();
    }
}
