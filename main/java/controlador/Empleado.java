package controlador;


import modelo.Empresa;


/**
 *
 * @author pc
 */
public class Empleado extends Empresa {
    
  private String nombreEmpleado;
  private String correo;
  private String rol;
  
  public Empleado(String nombreEmpleado,String nombreEmpresa,String correo,String rol){
      super(nombreEmpresa);
          
  }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
  
}
