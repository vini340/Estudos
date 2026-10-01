package POO.Aula11;

public class CriarPessoa {
    public static void main(String[] args) {
        Visitante v1 = new Visitante("Pedro", 22, "M");
        Aluno a1 = new Aluno("Maria", 19, "F", "Informática", 1111);
        Bolsista b1 = new Bolsista("João", 20, "M", "Engenharia", 2222, 1000.00);
        
        v1.apresentar();
        a1.apresentar();
        b1.apresentar();
        b1.renovarBolsa();
        b1.apresentar();
        b1.pagarMensalidade();
        a1.pagarMensalidade();

    }
}
