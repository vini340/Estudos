package POO.Aula06;

public class Motor implements DentroCarro{
    private boolean ligar;
    private boolean acelerador;
    private boolean freiar;
    private boolean embreagem;
    private double anguloDirecao;
    private double virarDireita;
    private double virarEsquerda;
    private int aumentarMarcha;
    private int diminuirMarcha;
    private boolean setaDireita;
    private boolean setaEsquerda;

    public Motor() {
        this.setLigar(false);
    }

    public boolean getAcelerador() {
        return acelerador;
    }
    public void setAcelerador(boolean acelerador) {
        this.acelerador = acelerador;
    }
    public boolean getFreiar() {
        return freiar;
    }
    public void setFreiar(boolean freiar) {
        this.freiar = freiar;
    }
    public boolean getEmbreagem() {
        return embreagem;
    }
    public void setEmbreagem(boolean embreagem) {
        this.embreagem = embreagem;
    }
    public double getVirarDireita() {
        return virarDireita;
    }
    public void setVirarDireita(double virarDireita) {
        this.virarDireita = virarDireita;
    }
    public double getVirarEsquerda() {
        return virarEsquerda;
    }
    public void setVirarEsquerda(double virarEsquerda) {
        this.virarEsquerda = virarEsquerda;
    }
    public int getAumentarMarcha() {
        return aumentarMarcha;
    }
    public void setAumentarMarcha(int aumentarMarcha) {
        this.aumentarMarcha = aumentarMarcha;
    }
    public int getDiminuirMarcha() {
        return diminuirMarcha;
    }
    public void setDiminuirMarcha(int diminuirMarcha) {
        this.diminuirMarcha = diminuirMarcha;
    }
    public boolean getSetaDireita() {
        return setaDireita;
    }
    public void setSetaDireita(boolean setaDireita) {
        this.setaDireita = setaDireita;
    }
    public boolean getSetaEsquerda() {
        return setaEsquerda;
    }
    public void setSetaEsquerda(boolean setaEsquerda) {
        this.setaEsquerda = setaEsquerda;
    }
    public boolean getLigar() {
        return ligar;
    }

    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    @Override
    public void virarDireita(Double graus) {
        if (this.getLigar() && graus > 0 && graus <= 90) {
            if (this.anguloDirecao + graus > 90) {
                System.out.println("Invalido, o seu carro não pode virar mais do que isso");
            }else{
                this.anguloDirecao = this.anguloDirecao + graus;
                System.out.println("Seu carro virou em um angulo " + this.anguloDirecao + " graus para a direita");
            }
        }
    }
    @Override
    public void virarEsquerda(Double graus) {
        if (this.getLigar() && graus < 0 && graus >= -90) {
            if (this.anguloDirecao + graus > -90) {
                System.out.println("Invalido, o seu carro não pode virar mais do que isso");
            }else{
                System.out.println("Seu carro virou em um angulo " + this.anguloDirecao + " graus para a esquerda");
                this.anguloDirecao = this.anguloDirecao + graus;
            }
        }
    }
    @Override
    public void acelerar() {
        if (this.getLigar()) {
            this.setAcelerador(true);
            System.out.println("Estou acelerando");
        }else{
            System.out.println("Precisa ligar o carro");
        }
    }
    @Override
    public void freio() {
        if (this.getLigar()) {
            this.setFreiar(true);
            System.out.println("Estou freiando");
        }else{
            System.out.println("Precisa ligar o carro");
        }
    }
    @Override
    public void embreagem() {
        if (this.getLigar()) {
            this.setEmbreagem(true);
        }
    }
    @Override
    public void aumentarMarcha() {
        if (this.getLigar() && getEmbreagem() == true) {
            System.out.println("Aumentei minha marcha");
        }else{
            System.out.println("Primeiro precisa pisar na embreagem");
        }
    }
    @Override
    public void diminuirMarcha() {
        if (this.getLigar() && getEmbreagem() == true) {
            System.out.println("Diminui minha marcha");
        }else{
            System.out.println("Primeiro precisa pisar na embreagem");
        }
    }
    @Override
    public void setaDireita() {
        if (this.getLigar() && this.anguloDirecao > 50 ) {
            System.out.println("Seta da direita ligada");
        }
    }
    @Override
    public void setaEsquerda() {
        if (this.getLigar() && this.anguloDirecao > -50 ) {
            System.out.println("Seta da direita ligada");
        }
    }
    @Override
    public void ligarCarro() {
        this.setLigar(true);
    }  
}
