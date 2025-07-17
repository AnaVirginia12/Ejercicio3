/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

/**
 *
 * @author Ana Virginia
 */
public class InventarioP {
    
    //Atributos
    private int CodigoProducto;
    private double CantidadProductosInresados;
    private double PrecioProducto;
    private String TipoProducto;
    private double PrecioBruto;
    private double Ganancia;

    public InventarioP(String NombreSuper, int CodigoSuper, int CodigoProducto, String NombreEmpleado, int CedulaEmpleado, double CantidadProductosInresados, double PrecioProducto, String TipoProducto, double PrecioBruto, double Ganancia) {
        this.CodigoProducto = CodigoProducto;
        this.CantidadProductosInresados = CantidadProductosInresados;
        this.PrecioProducto = PrecioProducto;
        this.TipoProducto = TipoProducto;
        this.PrecioBruto = PrecioBruto;
        this.Ganancia = Ganancia;
    }

     public void PrecioBruto (){
         switch (TipoProducto) {
             case "alimentos" :
                 PrecioBruto = PrecioProducto* 1.20;
                 break;
             case "bebidas":
                 PrecioBruto = PrecioProducto * 1.30;
                 break;
             case "Higiene":
                PrecioBruto = PrecioProducto * 1.25+500;
                break;
             case "Limpieza":
                 PrecioBruto = PrecioProducto * 1.23+1000+PrecioProducto;
                 break;    
             default:
                 PrecioBruto = PrecioProducto * 1.30;
                 break;

  
         }
                
     
     
     }
  

    public int getCodigoProducto() {
        return CodigoProducto;
    }

    public void setCodigoProducto(int CodigoProducto) {
        this.CodigoProducto = CodigoProducto;
    }

    public double getCantidadProductosInresados() {
        return CantidadProductosInresados;
    }

    public void setCantidadProductosInresados(double CantidadProductosInresados) {
        this.CantidadProductosInresados = CantidadProductosInresados;
    }

    public double getPrecioProducto() {
        return PrecioProducto;
    }

    public void setPrecioProducto(double PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    public String getTipoProducto() {
        return TipoProducto;
    }

    public void setTipoProducto(String TipoProducto) {
        this.TipoProducto = TipoProducto;
    }

    public double getPrecioBruto() {
        return PrecioBruto;
    }

    public void setPrecioBruto(double PrecioBruto) {
        this.PrecioBruto = PrecioBruto;
    }

    public double getGanancia() {
        return Ganancia;
    }

    public void setGanancia(double Ganancia) {
        this.Ganancia = Ganancia;
    }
    
        
    
    
            
    
    
    
    
}
