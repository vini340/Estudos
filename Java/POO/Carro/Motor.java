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

    public boolean getLigado() {
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
        if(getLigado() == false){
            System.out.println("O carro esta desligado, ligue o carro para pode fazer algo");
        }else if(getLigado() == true){
            if(getVelocidade() < 0){
                System.out.println("O carro esta em marcha ré, troque a marcha para frente para poder acelerar");
            }else if(getVelocidade() >= 0){
                while(getVelocidade() < 120){
                    if(getMarcha() == 0 ){
                        System.out.println("O carro esta em ponto morto, troque a marcha para frente para poder acelerar");
                    }else if(getMarcha() == 1 && getVelocidade() < 20){
                        setVelocidade(getVelocidade() + 5);
                        System.out.println("Acelerando... Velocidade atual: " + getVelocidade() + " km/h");
                            if(getVelocidade() >= 20){
                                System.out.println("Troque a marcha para poder acelerar mais");
                                break;
                            }
                    }else if(getMarcha() == 2 && getVelocidade() < 40 && getVelocidade() >= 20){
                        setVelocidade(getVelocidade() + 5);
                        System.out.println("Acelerando... Velocidade atual: " + getVelocidade() + " km/h");
                        if(getVelocidade() >= 40){
                                System.out.println("Troque a marcha para poder acelerar mais");
                                break;
                            }
                    }else if(getMarcha() == 3 && getVelocidade() < 60 && getVelocidade() >= 40){
                        setVelocidade(getVelocidade() + 5);
                        System.out.println("Acelerando... Velocidade atual: " + getVelocidade() + " km/h");
                        if(getVelocidade() >= 60){
                            System.out.println("Troque a marcha para poder acelerar mais");
                            break;
                        }
                    }else if(getMarcha() == 4 && getVelocidade() < 80 && getVelocidade() >= 60){
                        setVelocidade(getVelocidade() + 5);
                        System.out.println("Acelerando... Velocidade atual: " + getVelocidade() + " km/h");
                        if(getVelocidade() >= 80){
                            System.out.println("Troque a marcha para poder acelerar mais");
                            break;
                        }
                    }else if(getMarcha() == 5 && getVelocidade() < 100 && getVelocidade() >= 80){
                        setVelocidade(getVelocidade() + 5);
                        System.out.println("Acelerando... Velocidade atual: " + getVelocidade() + " km/h");
                        if(getVelocidade() >= 100){
                            System.out.println("Troque a marcha para poder acelerar mais");
                            break;
                        }
                    }else if(getMarcha() == 6 && getVelocidade() < 120 && getVelocidade() >= 100){
                        setVelocidade(getVelocidade() + 5);
                        System.out.println("Acelerando... Velocidade atual: " + getVelocidade() + " km/h");
                        if(getVelocidade() >= 120){
                            System.out.println("Velocidade máxima atingida");
                            break;
                        }
                    }
                }
            }
        }
    }

    @Override
    public void frear() {
        if(getLigado() == false){
            System.out.println("O carro esta desligado, ligue o carro para pode fazer algo");
        }else if(getLigado() == true){
            while(getVelocidade() > 0){
                setVelocidade(getVelocidade() - 5);
                System.out.println("Freando... Velocidade atual: " + getVelocidade() + " km/h");
            }
        }
    }

    @Override
    public void trocarMarcha() {
        if(getLigado() == false){
            System.out.println("O carro esta desligado, ligue o carro para pode fazer algo");
        }else if(getLigado() == true){
            if(getVelocidade() < 0){
                System.out.println("O carro esta em marcha ré, troque a marcha para frente para poder trocar a marcha");
            }else if(getVelocidade() >= 0){
                if(getMarcha() == 0 && getVelocidade() == 0){
                    setMarcha(1);
                    System.out.println("Marcha atual: " + getMarcha());
                }else if(getMarcha() == 1 && getVelocidade() >= 20){
                    setMarcha(2);
                    System.out.println("Marcha atual: " + getMarcha());
                }else if(getMarcha() == 2 && getVelocidade() >= 40){
                    setMarcha(3);
                    System.out.println("Marcha atual: " + getMarcha());
                }else if(getMarcha() == 3 && getVelocidade() >= 60){
                    setMarcha(4);
                    System.out.println("Marcha atual: " + getMarcha());
                }else if(getMarcha() == 4 && getVelocidade() >= 80){
                    setMarcha(5);
                    System.out.println("Marcha atual: " + getMarcha());
                }else if(getMarcha() == 5 && getVelocidade() >= 100){
                    setMarcha(6);
                    System.out.println("Marcha atual: " + getMarcha());
                }
            }
        }
    }

    @Override
    public void virarDireita() {
        if(getLigado() == false){
            System.out.println("O carro esta desligado, ligue o carro para pode fazer algo");
        }else if(getLigado() == true){
            System.out.println("Virando para a direita...");
        }
    }

    @Override
    public void virarEsquerda() {
        if(getLigado() == false){
            System.out.println("O carro esta desligado, ligue o carro para pode fazer algo");
        }else if(getLigado() == true){
            System.out.println("Virando para a esquerda...");
        }
    }

    @Override
    public void verificarVelocidade() {
        if(getLigado() == false){
            System.out.println("O carro esta desligado, ligue o carro para pode fazer algo");
        }else if(getLigado() == true){
            System.out.println("Velocidade atual: " + getVelocidade() + " km/h");
        }
    }
    
}
