import java.util.Random;

public class GeneradorDatos {
    private static Random random = new Random();
    private static String[] nombres = {"Ana", "Gabriela", "Wilson", "Carla", "Nicolas", "Maria", "Pedro", "Valeria", "Emilio"};
    private static String[] estados = {"Confirmada", "Pendiente", "Cancelada"};

    public static Reserva[] generarReservas(int cantidad){
        Reserva[] reservas = new Reserva[cantidad];
        for (int i = 0; i < cantidad; i++){
            int idCliente = random.nextInt(50000) + 1; // a de 1 a 50000
            String nombreCliente = nombres[random.nextInt(nombres.length)];
            int idReserva = i +1;

            int diaRes = random.nextInt(28) + 1;
            int mesRes = random.nextInt(12) + 1;
            String fechaReserva = String.format("%02d/%02d/2026", diaRes, mesRes);

            int diaVue = random.nextInt(28) + 1;
            int mesVue = random.nextInt(12) + 1;
            String fechaVuelo = String.format("%02d/%02d/2026", diaVue, mesVue);

            int idVuelo = random.nextInt(500) + 1;

            int hora = random.nextInt(24);
            int minuto = random.nextInt(60);
            String horaVuelo = String.format("%02d:%02d", hora, minuto);

            String estadoReserva = estados[random.nextInt(estados.length)];

            reservas[i] = new Reserva(idCliente, nombreCliente, idReserva, fechaReserva,
                                       fechaVuelo, idVuelo, horaVuelo, estadoReserva);

        }
        return reservas;
    }
}