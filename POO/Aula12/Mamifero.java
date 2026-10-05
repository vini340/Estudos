package POO.Aula12;

public class Mamifero extends Animal {
    private String corPelo;
    
    public Mamifero(String corPelo, float peso, int idade, int membros) {
        this.setCorPelo(corPelo);
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
    }

    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
    @Override
    public void alimentar() {
        System.out.println("Mamando");   
    }
    
}
