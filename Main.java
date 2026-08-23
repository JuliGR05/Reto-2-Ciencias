public class Main {

    public static void main(String[] args) {
        int[] tamanos = {100, 500, 1000, 10000, 50000, 100000, 500000, 1000000};

        for (int tam : tamanos) {
            Reserva[] desordenado = GeneradorDatos.generarReservas(tam);
            Reserva[] ordenado = desordenado.clone();
            QuickSort.ordenar(ordenado);

            int idBuscado = ordenado[tam / 2].getIdCliente(); // un cliente real, que sí existe

            long inicio, fin;

            inicio = System.nanoTime();
            int resultado1 = BusquedaLineal.buscarIndice(desordenado, idBuscado);
            fin = System.nanoTime();
            long tLinealDesordenado = fin - inicio;

            inicio = System.nanoTime();
            int resultado2 = BusquedaLineal.buscarIndice(ordenado, idBuscado);
            fin = System.nanoTime();
            long tLinealOrdenado = fin - inicio;

            inicio = System.nanoTime();
            int resultado3 = BusquedaBinaria.buscarIndice(ordenado, idBuscado);
            fin = System.nanoTime();
            long tBinariaOrdenado = fin - inicio;

            System.out.println("Tamaño: " + tam + " | Buscando idCliente: " + idBuscado);
            System.out.println("  Lineal desordenado: " + tLinealDesordenado + " ns (índice: " + resultado1 + ")");
            System.out.println("  Lineal ordenado:     " + tLinealOrdenado + " ns (índice: " + resultado2 + ")");
            System.out.println("  Binaria ordenado:    " + tBinariaOrdenado + " ns (índice: " + resultado3 + ")");
            System.out.println();
        }
    }
}