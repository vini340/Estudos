package POO.Aula12;

public class Arara extends Ave {
    public Arara(String corPena, float peso, int idade, int membros) {
        this.setCorPena(corPena);
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
    }

    public void Apresentacao(){
        System.out.println("Cor da Pena: " + this.getCorPena());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Membros: " + this.getMembros());
    }
    
}
