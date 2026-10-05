package POO.Aula12;

public class Cachorro extends Mamifero {
    public Cachorro(String corPelo, float peso, int idade, int membros) {
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

    public void EnterrarOsso() {
        System.out.println("Enterrando osso");
    }
    public void AbanarRabo() {
        System.out.println("Abanando rabo");
    }
}
