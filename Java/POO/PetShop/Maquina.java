package Java.POO.PetShop;

public class Maquina implements Banho {

    private double peso;
    private String clienteNome;
    private String raça;
    private String tipoPet;
    private boolean banho;
    private boolean estaLimpo;
    private double nivelAgua = 30.0;
    private double nivelShampoo = 10.0;

    public Maquina(double peso, String clienteNome, String raça, String tipoPet, Boolean estaLimpo) {
        this.setPeso(peso);
        this.setClienteNome(clienteNome);;
        this.setRaça(raça);;
        this.setTipoPet(tipoPet);;
        this.setEstaLimpo(false);
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
       }
    }

    @Override
    public void abastecerShampoo() {
        if (getNivelShampoo() >= 2.0) {
            System.out.println("O nivel de shampoo esta baixo, tem que reabastecer.");
            this.setNivelShampoo(10.0);
        }
    }

    @Override
    public void abastecerAgua() {
        if (getNivelAgua() >= 10.0) {
            System.out.println("O nivel da água esta baixo, tem que reabastecer.");
            this.setNivelAgua(30.0);
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
        if (getBanho() == true) {
            this.setEstaLimpo(true);
            System.out.println("O pet está limpo");
        }else{
            System.out.println("Não tem nenhum pet tomando banho");
        }
    }

    @Override
    public void retirarPetMaquina() {
        if (getBanho() == true && getEstaLimpo() == true) {
            System.out.println("Pode retirar o pet do banho");
        }else{
            System.out.println("Por gentileza, verefique se seu pet está limpo ou se tem algum pet tomando banho");
        }
    }

    @Override
    public void colocarPetMaquina() {
       
    }

    @Override
    public void limparMaquina() {
       
    }
    
    
}
