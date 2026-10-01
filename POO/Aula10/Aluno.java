package POO.Aula10;

public class Aluno extends Pessoa {
    public Aluno(String nome, int idade, String sexo, String curso) {
        super(nome, idade, sexo);
        this.setMatricula(true);
        this.setCurso(curso);
    }
    private Boolean matricula;
    private String curso;
    
    public Boolean getMatricula() {
        return matricula;
    }
    public void setMatricula(Boolean matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void cancelarMatricula(){
        this.setMatricula(false);
    }
    public void apresentarAluno() {
        System.out.println("----------------------------------");
        System.out.println("Aluno:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Matrícula: " + this.getMatricula());
    }
}
