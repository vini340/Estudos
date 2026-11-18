package Java.POO;

public class Banco {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Jonas", 0, 0, 0);
        conta1.depositarDinheiro();
        conta1.consultarSaldo();
        conta1.sacarDinheiro();
        conta1.consultarSaldo();
    }
}
