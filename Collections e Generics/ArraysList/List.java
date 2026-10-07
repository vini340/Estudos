package ArraysList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class List {
    
    public static void main(String[] args){
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list.isEmpty());
        

        ArrayList<String> list2 = new ArrayList<String>(20);
        System.out.println(list2.size());
    }

        @Test
        void testList() {
        Collection<Integer> numbers =  IntStream.range(1, 6)
            .boxed()
            .collect(Collectors.toSet());

        ArrayList<Integer> list3 = new ArrayList<Integer>(numbers);
        assertEquals(5, list3.size());
        assertTrue(numbers.containsAll(list3));
            
        
    }
}
