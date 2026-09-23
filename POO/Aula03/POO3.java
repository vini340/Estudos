public class POO3 {
    public static void main(String[] args){
        Caneta3 c1 = new Caneta3();
        c1.modelo = "BIC";
        c1.cor = "Vermelha";
        //c1.ponta = 0.5;
        c1.carga = 80;
        //c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
}
