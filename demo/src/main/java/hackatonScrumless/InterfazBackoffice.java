package hackatonScrumless;

public class InterfazBackoffice extends Interfaz{

    public void previsionMeteorologica(){
        super.previsionMeteorologica();
    }
    public Alerta crearAlerta(String titulo, String mensaje, NivelDeAlerta nivel, String zona){
        Alerta nuevaAlerta = new Alerta(
                titulo,
                mensaje,
                nivel,
                "Centro de Control Meteorológico", // Emisor por defecto
                zona
        );

        // 2. Aquí podrías añadir lógica extra antes de devolverla
        // Ejemplo: Si es DESASTRE, forzar que el mensaje esté en mayúsculas
        if (nivel == NivelDeAlerta.DESASTRE) {
            nuevaAlerta.setMensaje("\u001B[31m" + nuevaAlerta.getMensaje().toUpperCase() + "\u001B[0m");
        }

        return nuevaAlerta;
    }
    }
