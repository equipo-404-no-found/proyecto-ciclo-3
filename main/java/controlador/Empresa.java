/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pc
 */
public class Empresa {
    private String nombreEmpresa;
    private int nit;
    private String direccion;
    private int telefono;
    
    public Empresa(String nombreEmpresa,int nit,String direccion,int telefono){
        this.nombreEmpresa = nombreEmpresa;
        this.nit = nit;
        this.direccion  =direccion;
        this.telefono = telefono;
    }
    public Empresa(String nombreEmpresa){
    this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
