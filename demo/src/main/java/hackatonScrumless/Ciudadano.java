package hackatonScrumless;

public class Ciudadano {
    private String nic;
    private String contraseña;
    private TipoDeVivienda vivienda;
    private NecesidadesEspeciales necesidadesEspeciales;
    private String provincia;

    public Ciudadano() {
    }

    // Constructor con parámetros
    public Ciudadano(String nic, String contrasena, TipoDeVivienda vivienda,
                     NecesidadesEspeciales necesidadesEspeciales, String provincia) {
        this.nic = nic;
        this.contraseña = contrasena;
        this.vivienda = vivienda;
        this.necesidadesEspeciales = necesidadesEspeciales;
        this.provincia = provincia;
    }

    // --- GETTERS Y SETTERS ---

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getContrasena() {
        return contraseña;
    }

    public void setContrasena(String contrasena) {
        this.contraseña = contrasena;
    }

    public TipoDeVivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(TipoDeVivienda vivienda) {
        this.vivienda = vivienda;
    }

    public NecesidadesEspeciales getNecesidadesEspeciales() {
        return necesidadesEspeciales;
    }

    public void setNecesidadesEspeciales(NecesidadesEspeciales necesidadesEspeciales) {
        this.necesidadesEspeciales = necesidadesEspeciales;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }


}
