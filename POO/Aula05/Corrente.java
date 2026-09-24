package POO.Aula05;

public class Corrente {
    private int numConta;
    protected String tipo;
    protected String dono;
    private Float saldo;
    protected boolean status;

    public void Mostrar(){
        System.out.println("--------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
     public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (t == "CC") {
            this.setSaldo(50f); 
        }else if (t == "CP") {
            this.setSaldo(150f);
        }
        System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        }else if (this.getSaldo() < 0) {
            System.out.println("Conta com o saldo negativo");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar(Float v){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
        }else{
            System.out.println("Precisa abrir a conta antes de fazer o depósito");
        }
    }
    public void sacar(Float s){
        if (this.getStatus()) {
            if (this.getSaldo() >= s) {
                this.setSaldo(this.getSaldo() - s);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Precisa abrir a conta antes de sacar dinheiro da sua conta!");
        }
    }
    public void pagarMensal(){
        Float v = 0f;
        if (this.getTipo() == "CC") {
            v = 12f;
        }else if (this.getTipo() == "CP") {
            v = 20f;
        }
        if (this.getStatus()) {
             this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono()); 
        }else{
            System.out.println("Precisa abrir uma conta!");
        }
    }
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
   
}
