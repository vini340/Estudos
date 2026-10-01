package POO.Aula11;

public class Visitante extends Pessoa{
    public Visitante(String nome, int idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    public void apresentar(){
        System.out.println("Olá, meu nome é " + this.getNome() + ", tenho " + this.getIdade() + 
        " anos e sou do sexo " + this.getSexo() + ".");
    }
}
