package geometria;

public class Rectangulo {
	
	//Atributos
	private int ladoX;
	private int ladoY;
	private Punto verticeII;
	private Punto verticeSD;
	
	//Metodos
	public Rectangulo(Punto verticeII, int ladoX, int ladoY) {
		this.verticeII = verticeII;
		this.ladoX = ladoX;
		this.ladoY = ladoY;
	}
	
	public Rectangulo(Punto verticeII, Punto verticeSD) {
		this.verticeII = verticeII;
		this.verticeSD = verticeSD;
	}
	
	//Metodos
	public void deplazar(int x, int y) {
		this.verticeII.desplazar(x, y);
		this.verticeSD.desplazar(x, y);
	}
	
	public void escalar(int escalado) {
		escalado = escalado / 100;
		this.ladoX *= escalado;
		this.ladoY *= escalado;
		this.verticeSD.setX(this.verticeSD.getX() * escalado);
		this.verticeSD.setY(this.verticeSD.getY() * escalado);
	}
	
	//Get Set
	public int getLadoX() {
		return this.ladoX;
	}
	
	public int getLadoY() {
		return this.ladoY;
	}
	
	public Punto getVerticeII() {
		return this.verticeII;
	}
	
	public Punto getVerticeSD() {
		return this.verticeSD;
	}
	
}
