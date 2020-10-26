public class Hilo implements Runnable {
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
    }

    private void readNPrint() {
    }

    private void product2Arrays() {
    }

    private void bucle100() {

    }
}
