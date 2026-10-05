package POO.Aula13;

public class Lobo extends Mamifero {
    public Lobo(String corPelo, float peso, int idade, int membros) {
        this.setCorPelo(corPelo);
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
    }
    public void Apresentacao(){
        System.out.println("Cor do Pelo: " + this.getCorPelo());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Membros: " + this.getMembros());
    }
    @Override 
    public void emitirSom() {
        System.out.println("AUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }
}
