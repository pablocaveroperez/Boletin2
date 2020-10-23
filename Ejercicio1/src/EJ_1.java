import java.util.ArrayList;

public class EJ_1 {
    public static void main(String[] args) {
        final byte NUMTHREADS = 5;

        ArrayList<Thread> listThreads = new ArrayList<Thread>();
        ArrayList<Byte> byteArrayList = new ArrayList<>();

        // Creacion de los Threads
        for (byte i = 0; i < NUMTHREADS; i++) {
            System.out.println("Creando el hilo " + i);
            listThreads.add(new Thread(new Hilo()));
        }

        // Iniciacion de los threads
        for ()
    }
}
