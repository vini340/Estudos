package Exercicio;

public class Mouse4 {
    public static void main(String[] args) {
        MoldeMouse4 c1 = new MoldeMouse4("O meu mouse é preto", "Tem um tamanho médio", "Meu mouse tem 8 botões", "Sim", "Tem fio" );
        c1.status();
        c1.setMovendo(true);
        c1.setTrocandoCor(true);
        c1.sendoUsado();
    }
}
