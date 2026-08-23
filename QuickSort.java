public class QuickSort {

    public static void ordenar(Reserva[] reservas) {
        quicksort(reservas, 0, reservas.length - 1);
    }

    private static void quicksort(Reserva[] reservas, int inicio, int fin) {
        if (inicio < fin) {
            int posPivote = particionar(reservas, inicio, fin);
            quicksort(reservas, inicio, posPivote - 1);
            quicksort(reservas, posPivote + 1, fin);
        }
    }

    private static int particionar(Reserva[] reservas, int inicio, int fin) {
        int pivote = reservas[fin].getIdCliente();
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (reservas[j].getIdCliente() <= pivote) {
                i++;
                intercambiar(reservas, i, j);
            }
        }
        intercambiar(reservas, i + 1, fin);
        return i + 1;
    }

    private static void intercambiar(Reserva[] reservas, int a, int b) {
        Reserva temp = reservas[a];
        reservas[a] = reservas[b];
        reservas[b] = temp;
    }
}