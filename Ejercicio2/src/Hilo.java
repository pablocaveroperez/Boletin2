public class Hilo implements Runnable {
    private final byte BUCLE100 = 100;
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
    }

    private void bucle100() {
        for (int i = 0; i < BUCLE100; i++) {
            System.out.println(i);
        }
    }
}
