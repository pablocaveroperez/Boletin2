import validaciones.ValidaLibrary;

import java.util.ArrayList;

public class EJ_4 {
    public static void main(String[] args) {
        String sCadena = ValidaLibrary.leer("Introduce una cadena de texto: ");
        int iNumero = (int) ValidaLibrary.valida("Introduce un entero(entre -1000 y 1000): ", -1000, 1000, 1);
        double dNumero = (double) ValidaLibrary.valida("Introduce un double(entre -1000 y 1000): ", -1000, 1000, 2);

        Hilo1 hilo1 = new Hilo1(sCadena);
        Hilo2 hilo2 = new Hilo2(iNumero);
        Hilo3 hilo3 = new Hilo3(dNumero);

        ArrayList<Thread> listThread = new ArrayList<>();
        listThread.add(new Thread(hilo1));
        listThread.add(new Thread(hilo2));
        listThread.add(new Thread(hilo3));

        for (int i = 0; i < listThread.size(); i++) {
            listThread.get(i).start();
        }
    }
}
