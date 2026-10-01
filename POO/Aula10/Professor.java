package POO.Aula10;

public class Professor extends Pessoa {
    public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        super(nome, idade, sexo);
        this.setEspecialidade(especialidade);
        this.setSalario(salario);
    }
    private String especialidade;
    private float salario;
    
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void receberAumento(){
        this.setSalario(this.getSalario() + 100);
    }
    public void apresentarProfessor() {
        System.out.println("----------------------------------");
        System.out.println("Professor:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Especialidade: " + this.getEspecialidade());
        System.out.println("Salário: " + this.getSalario());
    }
}
