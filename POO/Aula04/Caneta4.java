public class Caneta4 {
    public String modelo;
    public String cor;
    private Double ponta;
    protected int carga;
    private boolean tampada;

    public Caneta4(String m, String C, Double p) {
        this.setModelo(m);
        this.setCor(C);
        this.setPonta(p);
        this.tampar();
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public String getCor(){
        return this.cor;
    } 
    public void setCor(String C){
        this.cor = C;
    }
    public Double getPonta(){
        return this.ponta;
    }
    public void setPonta(Double p){
        this.ponta = p;
    }
    public int getCarga(){
        return this.carga;
    }
    public void setCarga(int c){
        this.carga = c;
    }
    public boolean getTampada(){
        return this.tampada;
    }
    public void setTampada(Boolean t){
        this.tampada = t;
    }
    public void status(){
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Uma caneta " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Esta tampada? " + this.getTampada());
    }
    public void rabiscar(){
        if (this.tampada == true) {
            System.out.println("ERRO");
        }else{
            System.out.println("Rabisco");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}