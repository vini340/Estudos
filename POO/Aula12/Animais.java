package POO.Aula12;

public class Animais {
    public static void main(String[] args) {
        Cachorro c = new Cachorro("Marrom", 45f, 5, 4);
        c.Apresentacao();
        c.AbanarRabo();
        Canguru k = new Canguru("Marrom", 80f, 7, 4);
        k.Apresentacao();
        k.locomover();
        k.usarBolsa();
    }
}
