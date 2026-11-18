package Java.POO.Carro;

public class Motor implements Carro{

    private boolean ligado;
    private int velocidade;
    private int marcha;
    private boolean freio;
    private boolean direcao;
    private boolean acelerador;

    public Motor(boolean ligado, int velocidade, int marcha) {
        this.setMarcha(0);
        this.setVelocidade(0);
        this.setLigado(false);
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public boolean isFreio() {
        return freio;
    }

    public void setFreio(boolean freio) {
        this.freio = freio;
    }

    public boolean isDirecao() {
        return direcao;
    }

    public void setDirecao(boolean direcao) {
        this.direcao = direcao;
    }

    public boolean isAcelerador() {
        return acelerador;
    }

    public void setAcelerador(boolean acelerador) {
        this.acelerador = acelerador;
    }

    @Override
    public void ligar() {
        this.ligado = true;
    }

    @Override
    public void desligar() {
        this.ligado = false;
    }

    @Override
    public void acelerar() {
        
    }

    @Override
    public void frear() {
        
    }

    @Override
    public void trocarMarcha() {
        
    }

    @Override
    public void virarDireita() {
        
    }

    @Override
    public void virarEsquerda() {
        
    }

    @Override
    public void verificarVelocidade() {

    }
    
}
