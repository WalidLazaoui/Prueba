package geometria;

public class Circulo {
	
	public static final Punto ORIGEN_COORDENADAS = new Punto(0, 0);
	public static final int RADIO_DEFECTO = 5;
	//Atributos
	private Punto centro;
	private int radio;
	
	
	//Constructores
	public Circulo(Punto centro, int radio) {
		this.centro = new Punto(centro);
		this.radio = radio;
	}
	
	public Circulo() {
		//this(new Punto(), 5); si hay valores constantes, mejor declararlos
		this(ORIGEN_COORDENADAS, RADIO_DEFECTO);
	}
	
	public Circulo(Circulo circulo) {
		this(circulo.centro, circulo.radio);
	}
	
	//Metodos
	public void deplazar(int x, int y) {
		this.centro.desplazar(x, y);
	}
	
	public void escalar(float escalado) {
		this.radio *= (escalado/100);
	}
	
	//Get Set
	public double getPerimetro() {
		double perimetro = 2*Math.PI*this.radio;
		return perimetro;
	}
	
	public Punto getCentro() {
		return new Punto(this.centro); //Copia defensiva
	}
	
	public int getRadio() {
		return this.radio;
	}
}
