public class Hilo3 implements Runnable {
    private double dNumero;
    private final double DIEZ = 10.0;

    public Hilo3(double dNumero) {
        this.dNumero = dNumero;
    }

    @Override
    public void run() {
        double dResultado = dNumero / DIEZ;
        System.out.println("El resultado de dividir " + dNumero + " entre " + DIEZ + " es: " + dResultado);
    }
}
