import java.util.ArrayList;

public class BusquedaLineal {

    // TOdas las reservas del cliente
    public static ArrayList<Reserva> buscar(Reserva[] reservas, int idClienteBuscado) {
        ArrayList<Reserva> resultado = new ArrayList<>();
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i].getIdCliente() == idClienteBuscado) {
                resultado.add(reservas[i]);
            }
        }
        return resultado;
    }

    // Para índice de la primera coincidencia
    public static int buscarIndice(Reserva[] reservas, int idClienteBuscado) {
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i].getIdCliente() == idClienteBuscado) {
                return i;
            }
        }
        return -1;
    }
}