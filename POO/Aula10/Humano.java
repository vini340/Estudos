package POO.Aula10;

public class Humano {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("Vinicius", 19, "Masculino");
        Aluno p2 = new Aluno("Gabriel", 18, "Masculino", "Engenharia");
        Funcionario p3 = new Funcionario("João", 30, "Masculino", "TI");
        Professor p4 = new Professor("Maria", 40, "Feminino", "Matemática", 3000);
        p1.apresentarPessoa();
        p2.apresentarAluno();
        p3.apresentarFuncionario();
        p4.apresentarProfessor();
    }
}
