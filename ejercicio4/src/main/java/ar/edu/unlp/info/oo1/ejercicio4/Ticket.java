package ar.edu.unlp.info.oo1.ejercicio4;
import java.time.LocalDate;
import java.util.*;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	private List<Producto> productos;
	
	public Ticket(int cantidad, double peso, double precio, List<Producto> produ) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cantidad;
		this.pesoTotal = peso;
		this.precioTotal = precio;
		this.productos = produ;
	}
	
	public double impuesto() {
		return this.precioTotal * 0.21;
	}
	
	public List<Producto> getProductos() {
	    return new ArrayList<>(this.productos);
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
