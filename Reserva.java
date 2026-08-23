public class Reserva {
    private int idCliente;
    private String nombreCliente;
    private int idReserva;
    private String fechaReserva;
    private String fechaVuelo;
    private int idVuelo; 
    private String horaVuelo;
    private String estadoReserva;

    public Reserva(int idCliente, String nombreCliente, int idReserva, String fechaReserva, String fechaVuelo, int idVuelo, String horaVuelo, String estadoReserva){
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.idReserva = idReserva;
        this.fechaReserva = fechaReserva;
        this.fechaVuelo = fechaVuelo; 
        this.idVuelo = idVuelo;
        this.horaVuelo = horaVuelo;
        this.estadoReserva = estadoReserva;
    }

    //Getters

    public int getIdCliente(){
        return idCliente;
    }

    public String getNombreCliente(){
        return nombreCliente;
    }

    public int getIdReserva(){
        return idReserva;
    }

    public String getFechaReserva(){
        return fechaReserva;
    }

    public String getFechaVuelo (){
        return fechaVuelo;
    }

    public int getIdVuelo (){
        return idVuelo;
    }

    public String getHoraVuelo (){
        return horaVuelo;
    }

    public String getEstadoReserva (){
        return estadoReserva;
    }
}