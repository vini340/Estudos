package Exercicio;

public class Mouse {
    public static void main(String[] args) {
        MoldeMouse c1 = new MoldeMouse();
        c1.botoes = "Meu mouse tem 8 botões";
        c1.cor = "O meu mouse é preto";
        c1.fio = "Tem fio";
        c1.led = "Sim";
        c1.tamanho = "Tem um tamanho médio";
        c1.status();
        c1.estouMovendo();
        c1.troqueiCor();
        c1.sendoUsado();
    }
}
