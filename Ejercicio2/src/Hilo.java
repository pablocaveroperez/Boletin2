import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hilo implements Runnable {
    private static final int TAMANO_ARRAYS = 5;
    private final byte BUCLE100 = 100;
    private final byte MAX = 50;
    private final byte MIN = -50;
    private byte bId;
    public Hilo (byte bId) {
        this.bId = bId;
    }

    @Override
    public void run() {
        if (bId == 0)
            bucle100();
        else if (bId == 1)
            product2Arrays();
        else if (bId == 2)
            readNPrint();
        else
            System.out.println("ID introducido no valido.");
    }

    private void readNPrint() {
    }

    private void product2Arrays() {
        List<Integer> lResultado = new ArrayList<>();
        int[] array1 = new int[TAMANO_ARRAYS];
        int[] array2 = new int[TAMANO_ARRAYS];
        Random r = new Random();
        for (int i = 0; i < TAMANO_ARRAYS; i++) {
            array1[i] = (MIN + r.nextInt(MAX - MIN + 1));
            array2[i] = (MIN + r.nextInt(MAX - MIN + 1));
        }
        for (int i = 0; i < TAMANO_ARRAYS; i++) {
            lResultado.add(array1[i] * array2[i]);
        }
        System.out.println("Valores del primer array: ");
        for (int i = 0; i < TAMANO_ARRAYS; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("Valores del segundo array: ");
        for (int i = 0; i < TAMANO_ARRAYS; i++) {
            System.out.print(array2[i] + " ");
        }

        System.out.println("Resultado de multiplicar los dos arrays");
        System.out.println(lResultado);

    }

    private void bucle100() {
        for (int i = 0; i < BUCLE100; i++) {
            System.out.println(i);
        }
    }
}
