package ar.edu.unlp.info.oo1.ejercicio9;
import java.util.*;

public class Farola {
	private boolean encendida;
	private List<Farola> vecinas;
	
	public Farola() {
		this.encendida = false;
		this.vecinas = new ArrayList<Farola>();
				
	}
	public void pairWithNeighbor( Farola otraFarola) {
		otraFarola.addNeighbor(this);
		this.addNeighbor(otraFarola);
	}
	
	public void addNeighbor(Farola otraFarola) {
		this.vecinas.add(otraFarola);
	}
	
	public List<Farola> getNeighbors (){
		return this.vecinas;
	}
	
	public void turnOn() {
		if(encendida == false) {
			encendida = true;
			for(Farola v : this.getNeighbors()) {
				v.turnOn();
			}
		}
	}
	
	public void turnOff() {
		if(encendida == true) {
			encendida = false;
			for(Farola v : this.getNeighbors()) {
				v.turnOff();
			}
		}
	}
	
	public boolean isOn() {
		return this.encendida;
	}
	
	public boolean isOff() {
		return !this.encendida;
	}
}
