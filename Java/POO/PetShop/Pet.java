package Java.POO.PetShop;

public class Pet {
    public static void main(String[] args) {
        Maquina cachorro1 = new Maquina(30, "Vinicius", "Pug", "Cachorro", false); 
        cachorro1.darBanho();
        cachorro1.colocarPetMaquina();
        cachorro1.retirarPetMaquina();
        cachorro1.verificarShampoo();
        cachorro1.verififcarAgua();
        cachorro1.verificarPetBanho();
        cachorro1.retirarPetMaquina();
        cachorro1.limparMaquina();
        cachorro1.verificarShampoo();
        cachorro1.verififcarAgua();
    }
}
