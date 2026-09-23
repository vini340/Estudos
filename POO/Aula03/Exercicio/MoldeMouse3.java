package Exercicio;

public class MoldeMouse3 {
    public String cor;
    public String tamanho;
    public String botoes;
    protected String led;
    protected String fio;
    private boolean movendo;
    private boolean trocandoCor;
    public void status(){
        System.out.println("Qual a cor do seu mouse? " + this.cor);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Quantos botões? " + this.botoes);
        System.out.println("Tem led? " + this.led);
        System.out.println("Com fio? " + this.fio);
    }
    protected void sendoUsado(){
        if (movendo == true) {
            System.out.println("Estou sendo usado");
        }else if (movendo && trocandoCor == true) {
            System.out.println("Estou sendo usado e com meu led ligado");
        }else if(movendo == false && trocandoCor == true){
            System.out.println("Estou apenas com meu led ligado");
        }else{
            System.out.println("Não estou sendo usado e meu led esta desligado");
        }
    }
    public void estouMovendo(){
        this.movendo = false;
    }
    public void troqueiCor(){
        this.trocandoCor = true;
    }
}
