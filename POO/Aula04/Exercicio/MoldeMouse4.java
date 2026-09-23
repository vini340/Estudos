package Exercicio;

public class MoldeMouse4 {
    public String cor;
    public String tamanho;
    public String botoes;
    protected String led;
    protected String fio;
    private boolean movendo;
    private boolean trocandoCor;
    
    public MoldeMouse4(String cor, String tamanho, String botoes, String led, String fio) {
        this.setCor(cor);
        this.setTamanho(tamanho);
        this.setBotoes(botoes);
        this.setLed(led);
        this.setFio(fio);
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public String getBotoes() {
        return botoes;
    }
    public void setBotoes(String botoes) {
        this.botoes = botoes;
    }
    public String getLed() {
        return led;
    }
    public void setLed(String led) {
        this.led = led;
    }
    public String getFio() {
        return fio;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }
    public boolean isMovendo() {
        return movendo;
    }
    public void setMovendo(boolean movendo) {
        this.movendo = movendo;
    }
    public boolean isTrocandoCor() {
        return trocandoCor;
    }
    public void setTrocandoCor(boolean trocandoCor) {
        this.trocandoCor = trocandoCor;
    }
    public void status(){
        System.out.println("Qual a cor do seu mouse? " + this.getCor());
        System.out.println("Tamanho: " + this.getTamanho());
        System.out.println("Quantos botões? " + this.getBotoes());
        System.out.println("Tem led? " + this.getLed());
        System.out.println("Com fio? " + this.getFio());
    }
    protected void sendoUsado(){
        if (this.isMovendo() == true) {
            System.out.println("Estou sendo usado");
        }else if (this.isMovendo() == true && this.isTrocandoCor() == true) {
            System.out.println("Estou sendo usado e com meu led ligado");
        }else if(this.isMovendo() == false && this.isTrocandoCor() == true){
            System.out.println("Estou apenas com meu led ligado");
        }else{
            System.out.println("Não estou sendo usado e meu led esta desligado");
        }
    }
    public void estouMovendo(){
        this.movendo = false;
    }
    public void troqueiCor(){
        this.trocandoCor = true;
    }
}
