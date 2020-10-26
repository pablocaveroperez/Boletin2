import java.util.ArrayList;

public class EJ_1 {
    public static void main(String[] args) {
        final byte NUMTHREADS = 5;

        ArrayList<Hilo> listRunnables = new ArrayList<Hilo>();
        ArrayList<Thread> listThreads = new ArrayList<Thread>();


        byte[] byteArrayList = new byte[NUMTHREADS];

        for (byte i = 0; i < byteArrayList.length; i++) {
            byteArrayList[i] = 0;
        }

        // Creacion de los runnables
        for (byte i = 0; i < NUMTHREADS; i++) {
            listRunnables.add(new Hilo());
        }

        // Creacion de los hilos
        for(byte i = 0; i < NUMTHREADS ; i++) {
            System.out.println("Creando el hilo "+i+".");
            listThreads.add(new Thread(listRunnables.get(i)));
        }

        // Iniciacion de los hilos
        for (byte i = 0; i < NUMTHREADS; i++) {
            listThreads.get(i).start();
        }

        System.out.println("Antes del cambio de valores.");
        for (byte i = 0; i < byteArrayList.length; i++) {
            System.out.println("Valor de la posicion" + i + ": " + byteArrayList[i]);
        }

        // JOINS
        for (byte i = 0; i < NUMTHREADS; i++) {
            try {
                listThreads.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Cambiar el valor del array de numeros
        for (byte i = 0; i < byteArrayList.length; i++) {
            Hilo hilo = listRunnables.get(i);
            byteArrayList[i] = hilo.getiNum();
        }

        System.out.println("Despues del cambio de valores.");
        for (byte i = 0; i < byteArrayList.length; i++) {
            System.out.println("Valor de la posicion" + i + ": " + byteArrayList[i]);
        }


    }
}
