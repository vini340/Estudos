package POO.Aula09;

public class Leitura {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 25, "M");
        Livro l1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1000, 0, p1);

        l1.detalhes();
        l1.abrir();
        l1.avancarPag();
        l1.detalhes();
        l1.avancarPag();
        l1.detalhes();
        l1.voltarPag();
        l1.detalhes();
        l1.fechar();
        l1.detalhes();
    }
}
