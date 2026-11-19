package Java.POO.PetShop;

public class Maquina implements Banho {

    private double peso;
    private String clienteNome;
    private String raça;
    private String tipoPet;

    public Maquina(double peso, String clienteNome, String raça, String tipoPet) {
        this.peso = peso;
        this.clienteNome = clienteNome;
        this.raça = raça;
        this.tipoPet = tipoPet;
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
       
    }

    @Override
    public void abastecerShampoo() {
        
    }

    @Override
    public void abastecerAgua() {
        
    }

    @Override
    public void verififcarAgua() {
        
    }

    @Override
    public void verificarShampoo() {
        
    }

    @Override
    public void verificarPetBanho() {
       
    }

    @Override
    public void retirarPetMaquina() {
        
    }

    @Override
    public void colocarPetMaquina() {
       
    }

    @Override
    public void limparMaquina() {
       
    }
    
    
}
