package POO.Aula13;

public class Animais {
    public static void main(String[] args) {
        Lobo l = new Lobo("Cinza", 60f, 8, 4);
        l.Apresentacao();
        l.emitirSom();
        Cachorro c = new Cachorro("Marrom", 45f, 5, 4);
        c.Apresentacao();
        c.emitirSom();
        c.reagir(true);
        c.reagir("Vai apanhar");
    }
}
