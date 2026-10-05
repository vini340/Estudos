package POO.Aula12;

public class Tartaruga extends Reptil {
    public Tartaruga(String corEscama, float peso, int idade, int membros) {
        this.setCorEscama(corEscama);
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
    }
    public void Apresentacao(){
        System.out.println("Cor da Escama: " + this.getCorEscama());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Membros: " + this.getMembros());
    }
    @Override
    public void locomover() {
        System.out.println("Andando bem devagar");
    }
    
}
