package Exercicio;

public class Molde {
    String Hora;
    String Local;
    String Data;
    String Vestimenta;
    String Tipo;
    boolean cancelado;
    boolean foiAdiado;
    boolean mudouLocal;
    boolean convidarPessoa;

    void status(){
        System.out.println("Essa é a hora que o encontro está marcado " + this.Hora);
        System.out.println("Esse é o local que vamos nos encontrar " + this.Local);
        System.out.println("O encontro sera no dia " + this.Data);
        System.out.println("O tipo de encontro que vamos ir " + this.Tipo);
    }
    void deuCerto(){
        if (this.cancelado == true) {
            System.out.println("Sobrou nada");
        }else if(this.foiAdiado == true){
            System.out.println("Ainda de pé, mas foi adiado");
        }else if(this.convidarPessoa == true){
            System.out.println("Ainda de pé, mas nossos amigos vao ir juntos");
        }else{
            System.out.println("Esta de pé, e vamos em um encontro so nos dois");
        }
    }
    void cancelar(){
        this.cancelado = false;
    }
    void adiado(){
        this.foiAdiado = true;
    }
    void convidar_pessoa(){
        this.convidarPessoa = false;
    }
}

