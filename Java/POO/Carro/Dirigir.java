package Java.POO.Carro;

public class Dirigir {
    public static void main(String[] args) {
        Motor motor = new Motor(false, 0, 0);
        motor.ligar();
        motor.trocarMarcha();
        motor.acelerar();
        motor.trocarMarcha();
        motor.acelerar();
        motor.verificarVelocidade();
        motor.virarDireita();

    }
}
