package agustin.prototipoapp.entidades;

public class RespuestaInscFinal {
    boolean flag;
    String mensaje;

    public boolean isSuccess() {
        return flag;
    }

    public void setSuccess(boolean success) {
        this.flag = success;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
