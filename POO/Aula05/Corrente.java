package POO.Aula05;

public class Corrente {
    private int numConta;
    protected String tipo;
    protected String dono;
    private Float saldo;
    protected boolean status;

    public Corrente() {
        saldo = 0f;
        status = false;
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
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (t == "CC") {
            saldo = 50f;
        }else if (t == "CP") {
            saldo = 150f;
        }
    }
    public void fecharConta(){
        if (saldo > 0) {
            System.out.println("Conta com dinheiro");
        }else if (saldo < 0) {
            System.out.println("Conta com o saldo negativo");
        }else{
            setStatus(false);
        }
    }
    public void depositar(Float v){
        if (getStatus()) {
            setSaldo(getSaldo() + v);
        }else{
            System.out.println("Precisa abrir a conta antes de fazer o depósito");
        }
    }
    public void sacar(Float s){
        if (getStatus()) {
            if (getSaldo() > s) {
                setSaldo(getSaldo() - s);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Precisa abrir a conta antes de sacar dinheiro da sua conta!");
        }
    }
    public void pagarMensal(Float v){
        if (this.getTipo() == "CC") {
            v = 12f;
        }else if (this.getTipo() == "CP") {
            v = 20f;
        }
        if (getStatus()) {
            if (getSaldo() > v) {
               setSaldo(getSaldo() - v); 
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Precisa abrir uma conta!");
        }
    }
}
