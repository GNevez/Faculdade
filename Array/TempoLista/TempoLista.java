import java.util.ArrayList;
import java.util.LinkedList;

public class TempoLista {
    public static void main(String[] args) {
        int quantidadeElementos = 30000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        long inicioInsercaoArrayList = System.currentTimeMillis();

        for (int i = 0; i < quantidadeElementos; i++) {
            arrayList.add(0, i);
        }

        long fimInsercaoArrayList = System.currentTimeMillis();
        System.out.println("Tempo para inserir no início do ArrayList: " + (fimInsercaoArrayList - inicioInsercaoArrayList) + " ms");

        LinkedList<Integer> linkedList = new LinkedList<>();
        long inicioInsercaoLinkedList = System.currentTimeMillis();

        for (int i = 0; i < quantidadeElementos; i++) {
            linkedList.add(0, i);
        }

        long fimInsercaoLinkedList = System.currentTimeMillis();
        System.out.println("Tempo para inserir no início do LinkedList: " + (fimInsercaoLinkedList - inicioInsercaoLinkedList) + " ms");

        long inicioPercorreArrayList = System.currentTimeMillis();

        for (int i = 0; i < quantidadeElementos; i++) {
            arrayList.get(i);
        }

        long fimPercorreArrayList = System.currentTimeMillis();
        System.out.println("Tempo para percorrer ArrayList usando get: " + (fimPercorreArrayList - inicioPercorreArrayList) + " ms");

        long inicioPercorreLinkedList = System.currentTimeMillis();

        for (int i = 0; i < quantidadeElementos; i++) {
            linkedList.get(i);
        }

        long fimPercorreLinkedList = System.currentTimeMillis();
        System.out.println("Tempo para percorrer LinkedList usando get: " + (fimPercorreLinkedList - inicioPercorreLinkedList) + " ms");
    }
}
