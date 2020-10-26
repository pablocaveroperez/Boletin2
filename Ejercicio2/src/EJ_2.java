import java.util.ArrayList;

public class EJ_2 {
    public static void main(String[] args) {
        Hilo hilo1 = new Hilo((byte) 0);
        Hilo hilo2 = new Hilo((byte) 1);
        Hilo hilo3 = new Hilo((byte) 2);
        ArrayList<Thread> listThreads = new ArrayList<>();
        listThreads.add(new Thread(hilo1));
        listThreads.add(new Thread(hilo2));
        listThreads.add(new Thread(hilo3));

        for (Thread thread : listThreads) {
            thread.start();
        }

        for (Thread thread : listThreads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
