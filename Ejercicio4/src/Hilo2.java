public class Hilo2 implements Runnable {
    private final byte DIEZ = 10;
    private int iNumero;

    public Hilo2(int iNumero) {
        this.iNumero = iNumero;
    }


    @Override
    public void run() {
        int iResultado = iNumero + DIEZ;
        System.out.println("El resultado de sumar " + iNumero + " y " + DIEZ + " es: " + iResultado);
    }
}
