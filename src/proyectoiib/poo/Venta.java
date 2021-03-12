/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoiib.poo;

/**
 *
 * @author User
 */
public class Venta extends Producto {
    
    public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double totalPagar() {
		Double total = 0.0;
		total = total + super.getPrecio() * super.getStock();
		return total;
	}
    
    
}
