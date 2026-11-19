package Java.POO.PetShop;

import java.util.Scanner;

public class Maquina implements Banho {

    private double peso;
    private String clienteNome;
    private String raça;
    private String tipoPet;
    private boolean banho;
    private boolean estaLimpo;
    private double nivelAgua = 30.0;
    private double nivelShampoo = 10.0;
    private int petMaquina;

    public Maquina(double peso, String clienteNome, String raça, String tipoPet, Boolean estaLimpo) {
        this.setPeso(peso);
        this.setClienteNome(clienteNome);;
        this.setRaça(raça);;
        this.setTipoPet(tipoPet);;
        this.setEstaLimpo(false);
    }

    public int getPetMaquina() {
        return petMaquina;
    }

    public void setPetMaquina(int petMaquina) {
        this.petMaquina = petMaquina;
    }

    public double getNivelAgua() {
        return nivelAgua;
    }

    public void setNivelAgua(double nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public double getNivelShampoo() {
        return nivelShampoo;
    }

    public void setNivelShampoo(double nivelShampoo) {
        this.nivelShampoo = nivelShampoo;
    }

    public boolean getEstaLimpo() {
        return estaLimpo;
    }

    public void setEstaLimpo(boolean estaLimpo) {
        this.estaLimpo = estaLimpo;
    }

    public boolean getBanho() {
        return banho;
    }

    public void setBanho(boolean banho) {
        this.banho = banho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getTipoPet() {
        return tipoPet;
    }

    public void setTipoPet(String tipoPet) {
        this.tipoPet = tipoPet;
    }

    @Override
    public void darBanho() {
       if (getEstaLimpo() == false) {
        this.setBanho(true);
        System.out.println("Vamos dar banho em seu pet.");
        this.setNivelAgua(getNivelAgua() - 10.0);
        this.setNivelShampoo(getNivelShampoo() - 2.0);
       }else{
        System.out.println("Voce precisa colocar seu pet na maquina para darmos banho");
       }
    }

    @Override
    public void abastecerShampoo() {
        if (getNivelShampoo() >= 2.0) {
            System.out.println("O nivel de shampoo esta baixo, tem que reabastecer.");
            this.setNivelShampoo(getNivelShampoo() + 2.0);
            System.out.println("Após reabastecer seu nível de shampoo ficou: " + getNivelShampoo() + " litros");
        }else{
            System.out.println("Não precisa fazer o reabastecimento do shampoo, pode continuar dando banho.");
        }
    }

    @Override
    public void abastecerAgua() {
        if (getNivelAgua() >= 10.0) {
            System.out.println("O nivel da água esta baixo, tem que reabastecer.");
            this.setNivelAgua(getNivelAgua() + 2.0);
            System.out.println("Após reabastecer seu nível de água ficou: " + getNivelAgua() + " litros");
        }else{
            System.out.println("Não precisa fazer o reabastecimento da água, pode continuar dando banho.");
        }
    }

    @Override
    public void verififcarAgua() {
        if (getBanho() == true) {
           System.out.println("O seu nivel de água esta em " + getNivelAgua() + " litros.");
        } 
    }

    @Override
    public void verificarShampoo() {
        if (getBanho() == true) {
           System.out.println("O seu nivel de shampoo esta em " + getNivelShampoo() + " litros.");
        }
    }

    @Override
    public void verificarPetBanho() {
        if (getBanho() == true && getPetMaquina() == 1) {
            this.setEstaLimpo(true);
            System.out.println("O pet está limpo");
        }else{
            System.out.println("Não tem nenhum pet tomando banho, tem que colocar na maquina antes");
        }
    }

    @Override
    public void retirarPetMaquina() {
        if (getBanho() == true && getEstaLimpo() == true) {
            System.out.println("Pode retirar o pet do banho");
            this.setPetMaquina(0);
        }else if(getBanho() == true && getEstaLimpo() == false){
            System.out.println("O pet nao esta limpo ainda, voce tem certeza que vai retira-lo? ");
            Scanner scanner = new Scanner(System.in);
            String resposta = scanner.nextLine();
            switch(resposta){
                case "Sim":
                    System.out.println("Certo, mas precisara limpar a maquina antes de colocar outro pet.");
                    this.setPetMaquina(0);
                    this.limparMaquina();
                break;
                case "Nao":
                    System.out.println("Então pode esperar mais um pouco e verificar se o pet esta limpo.");
                break;
                default:
                    System.out.println("Opção invalida");
                break;
            }
        }
    }

    @Override
    public void colocarPetMaquina() {
       if (getBanho() == true && this.getPetMaquina() == 0) {
            this.setPetMaquina(1);
            System.out.println("Pet colocado na maquina");
       }else if (getPetMaquina() <= 1) {
            System.out.println("Ja tem um pet na maquina, não pode colocar mais do que um");
       }
    }

    @Override
    public void limparMaquina() {
       if (getBanho() == true && this.getPetMaquina() == 0) {
            System.out.println("Vamos limpar a maquina");
            this.setNivelAgua(getNivelAgua() - 3.0);
            this.setNivelShampoo(getNivelShampoo() - 1.0);
            System.out.println("Seu nivel de agua e shampoo após a limpeza diminuiram, por favor, verefique o nivel da água e shampoo para reabastecer caso precise.");
       }
    }
    
    
}
