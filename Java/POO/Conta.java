package Java.POO;
import java.util.Scanner;
public class Conta implements Metodos {
    private String titular;
    private int numero;
    private double saldo;
    private double chequeEspecial;

    public Conta(String titular, int numero, double saldo, double chequeEspecial) {
        setTitular(titular);
        setNumero(numero);
        setSaldo(0);
        setChequeEspecial(0);
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
        return chequeEspecial;
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
        
    }

    @Override
    public void pagarBoleto() {
       
    }

    @Override
    public void usandoChequeEspecial() {
        
    };
}

    

