package Exercicio;

public class MoldeMouse {
    String cor;
    String tamanho;
    String botoes;
    String led;
    String fio;
    boolean movendo;
    boolean trocandoCor;
    void status(){
        System.out.println("Qual a cor do seu mouse? " + this.cor);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Quantos botões? " + this.botoes);
        System.out.println("Tem led? " + this.led);
        System.out.println("Com fio? " + this.fio);
    }
    void sendoUsado(){
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
    void estouMovendo(){
        this.movendo = false;
    }
    void troqueiCor(){
        this.trocandoCor = true;
    }
}
