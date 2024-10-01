import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main2 {
    {

    }

    public static void main(String[] args) {

        System.out.println("-----------------------------------lista numeri random-------------------------------");
        List<Integer> listaInteri = new ArrayList<>();
        Random random = new Random();
        int n = 10;
        for (int i = 0; i < n; i++) {
            listaInteri.add(random.nextInt(100) + 1);
        }
        System.out.println(listaInteri);


        System.out.println("-------------------------------lista numeri random + lista inversa-------------------------------");
        List<Integer> listaInversa = new ArrayList<>(listaInteri);
        Collections.reverse(listaInversa);
        listaInteri.addAll(listaInversa);
        System.out.println(listaInteri);

        System.out.println("-------------------------------lista numeri pari/dispari-------------------------------");
        stampaPosizioni(listaInversa, true);
        stampaPosizioni(listaInversa, false);
    }

    public static void stampaPosizioni(List<Integer> lista, boolean pari) {
        for (int i = 0; i < lista.size(); i++) {
            if (pari && i % 2 == 0) {
                System.out.print(lista.get(i) + " ");
            } else if (!pari && i % 2 != 0) {
                System.out.print(lista.get(i) + " ");
            }
        }
        System.out.println();


    }
}