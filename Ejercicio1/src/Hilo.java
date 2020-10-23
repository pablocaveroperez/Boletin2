import java.util.ArrayList;
import java.util.Random;

public class Hilo implements Runnable {
    private final byte bMAXNUM = 50;
    private final byte bMINNUM = -50;
    private byte iNum;
    private ArrayList<Byte> byteArrayList = new ArrayList<>();

    public Hilo (ArrayList<Byte> byteArrayList) {
        this.byteArrayList = byteArrayList;
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

    public ArrayList<Byte> getByteArrayList() {
        return byteArrayList;
    }

    @Override
    public void run() {
        Random r = new Random();
        iNum = (byte) (bMINNUM + r.nextInt(bMAXNUM - bMINNUM + 1));

    }
}
