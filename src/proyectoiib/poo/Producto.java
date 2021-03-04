/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoiib.poo;


import java.io.Serializable;

public class Producto implements Serializable{
	private String codigo;
	private String nombre;
	private int stock;
	private double precio;

	public Producto(String codigo, String nombre, int stock, double precio) {
                this.codigo = codigo;
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
	}

	public Producto() {

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}