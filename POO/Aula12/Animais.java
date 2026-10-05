package POO.Aula12;

public class Animais {
    public static void main(String[] args) {
        Ave a = new Ave("Azul", 0.5f, 2, 2);
        a.Apresentacao();
        a.locomover();
        a.emitirSom();
        a.alimentar();
        System.out.println("-------------------");
        
        Mamifero m = new Mamifero("Marrom", 35.3f, 5, 4);
        m.Apresentacao();
        m.locomover();
        m.emitirSom();
        m.alimentar();
        System.out.println("-------------------");
        
        Reptil r = new Reptil("Verde", 0.8f, 1, 4);
        r.Apresentacao();
        r.locomover();
        r.emitirSom();
        r.alimentar();
        System.out.println("-------------------");

        Peixe p = new Peixe("Prata", 0.2f, 1, 0);
        p.Apresentacao();
        p.locomover();
        p.emitirSom();
        p.alimentar();
        System.out.println("-------------------");
    }
}
