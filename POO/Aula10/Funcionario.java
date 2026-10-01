package POO.Aula10;

public class Funcionario extends Pessoa {
    public Funcionario(String nome, int idade, String sexo, String setor) {
        super(nome, idade, sexo);
        this.setSetor(setor);
        this.setTrabalhando(true);
    }
    private String setor;
    private Boolean trabalhando;
    
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public Boolean isTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    public void mudarTrabalho(){
        this.setSetor("Novo Setor");
    }
    public void apresentarFuncionario() {
        System.out.println("----------------------------------");
        System.out.println("Funcionário:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Setor: " + this.getSetor());
        System.out.println("Trabalhando: " + this.isTrabalhando());
    }
}
