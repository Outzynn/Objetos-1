package ar.edu.unlp.info.oo1.ejercicio3;
import java.time.LocalDate;
import java.util.*;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private ArrayList<Item> items;
	
	
	public Presupuesto(String nombre) {
		this.setCliente(nombre);
		this.setFecha(LocalDate.now());
		this.items = new ArrayList<>();
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		double total = 0;
		for( Item i : this.items) {
			total += i.costo();
		}
		return total;
	}
	
}
