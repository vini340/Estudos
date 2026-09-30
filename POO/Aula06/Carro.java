package POO.Aula06;

public abstract class Carro {
    public static void main(String[] args) {
        Motor c1 = new Motor();
        c1.ligarCarro();
        c1.freio();
        c1.embreagem();
        c1.diminuirMarcha();
        c1.virarDireita(100.0);
        c1.setaDireita();
    }
}
