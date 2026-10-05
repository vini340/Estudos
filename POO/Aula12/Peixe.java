package POO.Aula12;

public class Peixe extends Animal {
    private String corEscama;
    
    public Peixe(String corEscama, float peso, int idade, int membros) {
        this.setCorEscama(corEscama);
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
    }

    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    public void soltarBolha() {
        System.out.println("Soltando bolhas");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de peixe");
    }
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");   
    }
    
}
