import java.util.ArrayList;

public class EJ_3 {

    public static void main(String[] args) {
        final byte ARRAY_SIZE = 10;
        final byte NUMTHREADS = 5;
        ArrayList<Hilo> listRunnable = new ArrayList<>();
        byte[] elementos = new byte[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE; i++) {
            elementos[i] = 0;
        }

        for (int i = 0; i < NUMTHREADS; i++) {
            listRunnable.add(new Hilo());
        }

        for (int i = 0; i < NUMTHREADS; i++) {
            System.out.println("\nAntes:");
            imprimirArray(elementos);
            listRunnable.get(i).run();
            elementos = listRunnable.get(i).getElementos();
            System.out.println("\nDespues:");
            imprimirArray(elementos);
        }
    }

    private static void imprimirArray(byte[] bytes) {
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }
    }
}
