/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

/**
 *
 * @author Ana Virginia
 */
public class Empleado {
    
    private String NombreEmpleado;
    private int CedulaEmpleado;

    public Empleado(String NombreEmpleado, int CedulaEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
        this.CedulaEmpleado = CedulaEmpleado;
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public int getCedulaEmpleado() {
        return CedulaEmpleado;
    }

    public void setCedulaEmpleado(int CedulaEmpleado) {
        this.CedulaEmpleado = CedulaEmpleado;
    }
    
   
}
