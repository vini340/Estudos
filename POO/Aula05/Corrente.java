package POO.Aula05;

public class Corrente {
    private int numConta;
    protected String tipo;
    protected String dono;
    private Float saldo;
    protected String status;

    public Corrente(int numConta, String tipo, String dono, Float saldo, String status) {
        this.setNumConta(numConta);
        this.setTipo(tipo);
        this.setDono(dono);
        this.setSaldo(saldo);
        this.setStatus(status);
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public Float getSaldo() {
        return saldo;
    }
    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void mostrar(){
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Qual seria o tipo da conta? " + this.getTipo());
        System.out.println("Qual é o dono da conta? " + this.getDono());
        System.out.println("Seu saldo atualmente é de R$" + this.getSaldo());
        System.out.println("Qual é o estado dessa conta? " + this.getStatus());
    }
    public void abrirConta(){

    }
    public void fecharConta(){

    }
    public void depositar(){

    }
    public void sacar(){

    }
    public void pagarMensal(){

    }
}
