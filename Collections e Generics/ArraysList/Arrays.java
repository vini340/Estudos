package ArraysList;
import java.util.ArrayList;
import java.util.Collections;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<String> filmes = new ArrayList<String>();
        filmes.add("Homem - Aranha");
        filmes.add("Vingadores");
        filmes.add("Flash");
        filmes.add("Venom");

        for(String filme : filmes){
            System.out.println(filme);
        }

        Collections.sort(filmes);

        for(String filme : filmes){
            System.out.println(filme);
        }
        
        filmes.remove(1);
        for(String filme : filmes){
            System.out.println(filme);
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(1);
        numbers.add(3453);
        numbers.add(1453);
        numbers.add(1313);
        numbers.add(576);
        numbers.add(100);
        numbers.add(234234);
        numbers.add(234);
        numbers.add(23423);
        numbers.add(100);
        numbers.add(67657);
        numbers.add(89789);
        numbers.add(55);
        numbers.add(3);
        numbers.add(567);
        numbers.add(9089);
        numbers.add(134134);

        Collections.sort(numbers);

        for(Integer number : numbers){
            System.out.println(number);
        }

        Collections.reverse(numbers);
        System.out.println("Após a inversão:");

        for(Integer number : numbers){
            System.out.println(number);
        }


        //nome.remove(3);
        //System.out.println("Após a remoção:");
        //for(int i = 0; i < nome.size(); i++){
           // System.out.println(nome.get(i));
        //}

        //nome.clear();
        //System.out.println("Após a limpeza:");
        //for(int i = 0; i < nome.size(); i++){
           // System.out.println(nome.get(i));
        //}
    }
}