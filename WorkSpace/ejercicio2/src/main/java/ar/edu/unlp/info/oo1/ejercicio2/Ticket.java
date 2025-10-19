package ar.edu.unlp.info.oo1.ejercicio2;
import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	public Ticket(int cantidad, double peso, double precio) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cantidad;
		this.pesoTotal = peso;
		this.precioTotal = precio;
	}
	
	public double impuesto() {
		return this.precioTotal * 0.21;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public String toString() {
		return "Fecha: " + this.getFecha() + 
				". Cantidad de productos comprados: " + this.getCantidadDeProductos() +
				". Peso total de su compra: " + this.getPesoTotal() + ", Precio total: " + this.getPrecioTotal();
	}
}
