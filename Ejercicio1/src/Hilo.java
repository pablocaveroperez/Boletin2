import java.util.ArrayList;

public class Hilo implements Runnable {

    ArrayList<Byte> byteArrayList = new ArrayList<>();

    public Hilo (ArrayList<Byte> byteArrayList) {
        this.byteArrayList = byteArrayList;
    }

    @Override
    public void run() {

    }
}
