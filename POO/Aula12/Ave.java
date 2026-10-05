package POO.Aula12;

public class Ave extends Animal {
    private String corPena;
    
    public Ave(String corPena, float peso, int idade, int membros) {
        this.setCorPena(corPena);
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
    }
    
    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    public void fazerNinho() {
        System.out.println("Construindo ninho");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");   
    }
    
}
