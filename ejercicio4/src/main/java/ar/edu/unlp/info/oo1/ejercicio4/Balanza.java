package ar.edu.unlp.info.oo1.ejercicio4;
import java.util.*;

public class Balanza {

	private List<Producto> productos;
	
	public Balanza() {	
		this.productos = new ArrayList<>();
	}
	
	public void ponerEnCero() {
		this.productos.clear();
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}

	public double getPrecioTotal() {
		double total = 0;
		for(Producto p : this.productos) {
			total+= p.getPrecio();
		}
		return total;
	}

	public double getPesoTotal() {
		double total = 0;
		for(Producto p : this.productos) {
			total+= p.getPeso();
		}
		return total;
	}

	public List<Producto> getProductos(){
		return new ArrayList<>(this.productos);
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal(), this.getProductos());
		return ticket;
	}
}
