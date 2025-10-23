package ar.edu.unlp.info.oo1.ejercicio7;

public class Cuerpo3D {
	
	private double altura;
	private Figura caraBasal;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setCaraBasal(Figura cara) {
		this.caraBasal = cara;
	}
	
	public double getVolumen() {
		double areaCara = this.caraBasal.getArea();
		double altura = this.getAltura();
		
		return areaCara * altura;
	}
	
	public double getSuperficieExterior() {
		double areaCara = this.caraBasal.getArea();
		double perimetroCara = this.caraBasal.getPerimetro();
		double altura = this.getAltura();
		
		double areaCuerpo = (areaCara * 2) + (perimetroCara * altura);
		
		return areaCuerpo;
	}
}
