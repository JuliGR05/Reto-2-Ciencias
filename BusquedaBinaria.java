public class BusquedaBinaria {

    // Requiere que el arreglo ya esté ordenado por idCliente
    public static int buscarIndice(Reserva[] reservas, int idClienteBuscado) {
        int inicio = 0;
        int fin = reservas.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            int idMedio = reservas[medio].getIdCliente();

            if (idMedio == idClienteBuscado) {
                return medio; // encontrado
            } else if (idMedio < idClienteBuscado) {
                inicio = medio + 1; // buscar en la mitad derecha
            } else {
                fin = medio - 1; // buscar en la mitad izquierda
            }
        }

        return -1; // no encontrado
    }
}