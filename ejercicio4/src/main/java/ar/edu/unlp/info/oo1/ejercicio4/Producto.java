package ar.edu.unlp.info.oo1.ejercicio4;

public class Producto {

	private double Peso;   //Suponemos que el peso se expresa en kilogramos. 
	private double precioPorKilo;
	private String descripcion;
	
	public Producto(String txt, double peso, double precio) {
		this.setDescripcion(txt);
		this.setPeso(peso);
		this.setPrecioPorKilo(precio);
	}

	public void setPeso(double peso) {
		Peso = peso;
	}

	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	public double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPrecio() {
		return this.Peso * this.precioPorKilo;
	}
	public double getPeso() {
		return this.Peso;
	}
}
