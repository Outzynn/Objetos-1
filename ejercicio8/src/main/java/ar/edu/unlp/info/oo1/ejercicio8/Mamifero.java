package ar.edu.unlp.info.oo1.ejercicio8;
import java.time.LocalDate;

public class Mamifero {
	
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre,madre;
	
	public Mamifero() {
	}
	
	public Mamifero(String nombre) {
		this.identificador = nombre;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Mamifero getPadre() {
		return this.padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	
	
	public Mamifero getAbueloMaterno() {
		if(this.getMadre()!= null) {
			return this.getMadre().getPadre();
		}
		return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if(this.getMadre()!=null) {
			return this.getMadre().getMadre();
		}
		return null;
	}

	public Mamifero getAbueloPaterno() {
		
		if(this.getPadre()!=null) {
			return this.getPadre().getPadre();
		}
		return null;
	}
	public Mamifero getAbuelaPaterna() {
		if(this.getPadre()!=null) {
			return this.getPadre().getMadre();
		}
		return null;
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		boolean tiene = false;
		Mamifero padre = this.getPadre();
		Mamifero madre = this.getMadre();
		
		if(padre != null) {
			if(padre == unMamifero) {
				return true;
			}
			else {
				tiene = padre.tieneComoAncestroA(unMamifero);
			}
		}
		if(tiene == false & madre!=null) {
			if(madre == unMamifero) {
				return true;
			}
			else {
				tiene = madre.tieneComoAncestroA(unMamifero);
			}
		}
		return tiene;
	}
	
	
	
	
	
	
	
	
}
