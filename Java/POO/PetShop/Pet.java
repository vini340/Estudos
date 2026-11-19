package Java.POO.PetShop;

public class Pet {
    public static void main(String[] args) {
        Maquina cachorro1 = new Maquina(30, "Vinicius", "Pug", "Cachorro", false); 
        cachorro1.darBanho();
        cachorro1.verififcarAgua();
        cachorro1.darBanho();
        cachorro1.verififcarAgua();
        cachorro1.abastecerAgua();
        cachorro1.verififcarAgua();
    }
}
