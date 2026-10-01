package POO.Aula11;

public class Bolsista extends Aluno {
    private double bolsa;

    public Bolsista(String nome, int idade, String sexo, String curso, int matricula, double bolsa) {
        super(nome, idade, sexo, curso, matricula);
        this.setBolsa(bolsa);
    }

    public void renovarBolsa(){
        this.setBolsa(this.getBolsa() + 100);
    }
    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga com desconto de 10%!");
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public void apresentar(){
        System.out.println("Olá, meu nome é " + this.getNome() + ", tenho " + this.getIdade() + 
        " anos e sou do sexo " + this.getSexo() + ". Estou matriculado no curso de " + this.getCurso() +
        " com a matrícula número " + this.getMatricula() + ". Recebo uma bolsa de R$" + this.getBolsa() + ".");
    }
}
