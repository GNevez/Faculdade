import java.util.ArrayList;
import java.util.HashSet;

public class Tempo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        long inicioInsercaoArrayList = System.currentTimeMillis();

        for (int i = 0; i < 30000; i++) {
            arrayList.add(i);
        }

        long fimInsercaoArrayList = System.currentTimeMillis();
        System.out.println("Tempo para inserir no ArrayList: " + (fimInsercaoArrayList - inicioInsercaoArrayList) + " ms");

        long inicioBuscaArrayList = System.currentTimeMillis();

        for (int i = 0; i < 30000; i++) {
            arrayList.contains(i);
        }

        long fimBuscaArrayList = System.currentTimeMillis();
        System.out.println("Tempo para buscar no ArrayList: " + (fimBuscaArrayList - inicioBuscaArrayList) + " ms");

        HashSet<Integer> hashSet = new HashSet<>();
        long inicioInsercaoHashSet = System.currentTimeMillis();

        for (int i = 0; i < 30000; i++) {
            hashSet.add(i);
        }

        long fimInsercaoHashSet = System.currentTimeMillis();
        System.out.println("Tempo para inserir no HashSet: " + (fimInsercaoHashSet - inicioInsercaoHashSet) + " ms");

        long inicioBuscaHashSet = System.currentTimeMillis();

        for (int i = 0; i < 30000; i++) {
            hashSet.contains(i);
        }

        long fimBuscaHashSet = System.currentTimeMillis();
        System.out.println("Tempo para buscar no HashSet: " + (fimBuscaHashSet - inicioBuscaHashSet) + " ms");
    }
}
