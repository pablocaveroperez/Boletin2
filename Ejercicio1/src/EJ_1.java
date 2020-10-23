import java.util.ArrayList;

public class EJ_1 {
    public static void main(String[] args) {
        final byte NUMTHREADS = 5;

        ArrayList<Thread> listThreads = new ArrayList<Thread>();
        ArrayList<Byte> byteArrayList = new ArrayList<>();

        // Creacion de los Threads
        for (byte i = 0; i < NUMTHREADS; i++) {
            System.out.println("Creando el hilo " + i);
            byteArrayList.add((byte) 0);
            listThreads.add(new Thread(new Hilo(byteArrayList)));
        }

        // Iniciacion de los threads
        for (byte i = 0; i < NUMTHREADS; i++) {
            System.out.println("Iniciando el hilo: " + i);
            listThreads.get(i).start();
        }

        // JOINS
        for (byte i = 0; i < NUMTHREADS; i++) {
            try {
                listThreads.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
