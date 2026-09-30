package POO.Aula07;

public class Lutador {
    public static void main(String[] args) {
        CadastroLutador l[] = new CadastroLutador[6];
        l[0]  = new CadastroLutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 
        3, 1);
        l[1] = new CadastroLutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 
        2, 3);
        l[2] = new CadastroLutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 
        2, 1);
        l[3] = new CadastroLutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 
        0, 2);
        l[4] = new CadastroLutador("UFOCobol", "Brasil", 37, 1.70, 119.3, 5,
        4, 3);
        l[5] = new CadastroLutador("Nerdaart", "EUA", 30, 1.81, 105.7, 12,
        2, 4);

        l[1].Status();
    }
}
