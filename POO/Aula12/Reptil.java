package POO.Aula12;

public class Reptil extends Animal {
    private String corEscama;
    
    public Reptil(String corEscama, float peso, int idade, int membros) {
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
    
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de réptil");
    }
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");   
    }
    
}
