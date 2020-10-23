import java.util.ArrayList;
import java.util.Random;

public class Hilo implements Runnable {
    private final byte bMAXNUM = 50;
    private final byte bMINNUM = -50;
    private byte iNum;

    public Hilo () {
    }

    public byte getbMAXNUM() {
        return bMAXNUM;
    }

    public byte getbMINNUM() {
        return bMINNUM;
    }

    public byte getiNum() {
        return iNum;
    }

    private void setiNum(byte iNum) {
        this.iNum = iNum;
    }

    @Override
    public void run() {
        Random r = new Random();
        setiNum((byte) (bMINNUM + r.nextInt(bMAXNUM - bMINNUM + 1)));
        cambiarValorArrayList();
    }

    private void cambiarValorArrayList() {

    }
}
