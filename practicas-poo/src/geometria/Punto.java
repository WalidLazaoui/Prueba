package geometria;

public class Punto {
	//Atributos
	private int x;
	private int y;
	
	//Contructores
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Punto() {
		this(0, 0);
	}
	
	public Punto(Punto punto) {
		this(punto.x, punto.y);
	}
	
	//Metodos
	public void desplazar(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	public double distancia(Punto punto) {
		double distancia = Math.sqrt(Math.pow(punto.x - this.x, 2) + 
				Math.pow(punto.y - this.y, 2));
		return distancia;
	}
	
	public void desplazar(Direccion direccion) {
		//No usar switch mejor ifs, switch arcaicos?????
		//Intetar usar los metodos sobrecargados, no usar this si esta incluido en la misma clase.
		switch (direccion) {
		case ARRIBA:
			this.y += 1;
			break;
		case ABAJO:
			this.y -= 1;		
			break;
		case DERECHA:
			this.x += 1;
			break;
		case IZQUIERDA:
			this.x -= 1;
			break;

		default:
			break;
		}
	}
	
	public static Punto mayorDistancia(Punto... puntos) {//Argumento de tamaño variable
		Punto maxpunto = new Punto();
		for(Punto punto : puntos) {//for each, el mas eficiente??
			
		}
		
		return null;
		
	}
	//Get Set
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

}
