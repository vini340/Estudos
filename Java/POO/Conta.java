package Java.POO;

public class Conta {
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
    };

    
}
