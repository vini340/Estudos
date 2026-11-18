package Java.POO;
import java.util.Scanner;
public class Conta implements Metodos {
    private String titular;
    private int numero;
    private double saldo;
    private double chequeEspecial;

    public Conta(String titular, int numero, double saldo) {
        setTitular(titular);
        setNumero(numero);
        setSaldo(0);
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getChequeEspecial() {
        return this.chequeEspecial;
    }
    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public void depositarDinheiro() {
       System.out.println("Qual o valor que deseja depositar?");
       Scanner scanner = new Scanner(System.in);
       double valor = scanner.nextDouble();
       if(valor > 0){
        setSaldo(getSaldo() + valor);
       }else{
        System.out.println("Valor invalido");
       }
    }

    @Override
    public void sacarDinheiro() {
       System.out.println("Qual o valor que deseja sacar?");
       Scanner scanner = new Scanner(System.in);
       double valor = scanner.nextDouble();
       if(valor > 0){
        if(getSaldo() >= valor){
         setSaldo(getSaldo() - valor);
        }else{
         System.out.println("Saldo insuficiente");
        }
       }else{
        System.out.println("Valor invalido");
       }
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual: " + getSaldo());
    }

    @Override
    public void consultarChequeEspecial() {
        if(getSaldo() < 500){
            this.setChequeEspecial(50);
            System.out.println("Voce tem acesso ao seu cheque especial, no valor de " + getChequeEspecial());
        }else if(this.getSaldo() > 500){
            this.setChequeEspecial(getSaldo() * 0.5);
            System.out.println("Voce tem acesso ao seu cheque especial, no valor de " + getChequeEspecial());
        }
    }

    @Override
    public void pagarBoleto() {
        System.out.println("Qual o valor do boleto que deseja pagar?");
        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();
        if(valor > 0){
            if(getSaldo() >= valor){
                setSaldo(getSaldo() - valor);
                System.out.println("Boleto pago com sucesso, seu saldo atual e de: " + getSaldo());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }
    }

    @Override
    public void usandoChequeEspecial() {
        this.setChequeEspecial(getChequeEspecial() - 100);
        if(getChequeEspecial() < 0){
            System.out.println("Voce atingiu o limite do seu cheque especial, sera cobrado uma taxa de 20% do valor do seu saldo");
            this.setSaldo(getSaldo() - (0.20 * getSaldo()));
            System.out.println("Seu saldo atual e de: " + getSaldo());
    }else{
        System.out.println("Voce ainda tem acesso ao seu cheque especial, no valor de " + getChequeEspecial());
    }
    }
}