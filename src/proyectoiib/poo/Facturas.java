/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoiib.poo;

import java.io.Serializable;

public class Facturas implements Serializable{
	private int cedula;
	private String nombre;
	private String ciudad;
	private String domicilio;

	public Facturas(int cedula, String nombre, String ciudad, String domicilio) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.domicilio = domicilio;
	}

	public Facturas() {

	}

	public int getCedula() {
		return cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getDomicilio() {
		return domicilio;
	}

}