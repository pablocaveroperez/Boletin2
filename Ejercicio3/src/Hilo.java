import java.util.Random;

public class Hilo implements Runnable {
    private final byte ARRAY_SIZE = 10;
    private byte[] elementos = new byte[ARRAY_SIZE];
    private final byte bMINNUM = -50;
    private final byte bMAXNUM = 50;

    public Hilo() {

    }

    public byte[] getElementos() {
        return elementos;
    }

    public void setElementos(byte[] elementos) {
        this.elementos = elementos;
    }


    @Override
    public void run() {
        Random r = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            elementos[i] = (byte) (bMINNUM + r.nextInt(bMAXNUM - bMINNUM + 1));
        }
    }
}
