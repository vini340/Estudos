package POO.Aula11;

public class Aluno extends Pessoa {
    private String curso;
    private int matricula;

    public Aluno(String nome, int idade, String sexo, String curso, int matricula) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setCurso(curso);
        this.setMatricula(matricula);
    }

    public void pagarMensalidade(){
        System.out.println("Mensalidade paga com sucesso!");
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public void apresentar(){
        System.out.println("Olá, meu nome é " + this.getNome() + ", tenho " + this.getIdade() + 
        " anos e sou do sexo " + this.getSexo() + ". Estou matriculado no curso de " + this.getCurso() +
        " com a matrícula número " + this.getMatricula() + ".");
    }
}
