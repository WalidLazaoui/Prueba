package pruebas;
import geometria.*;
public class Pruebas {

	public static void main(String[] args) {
		Punto punto1 = new Punto(2,  3);
		Circulo circulo1 = new Circulo(punto1, 3);
		Circulo circulo2 = new Circulo(punto1, 5);
		circulo1.deplazar(3, 2);
		/*
		System.out.println(circulo1.getCentro().getX());
		System.out.println(circulo1.getCentro().getY());
		System.out.println(circulo2.getCentro().getX());
		System.out.println(circulo2.getCentro().getY());
		
		Punto punto2 = new Punto(circulo2.getCentro());
		punto2.desplazar(1, 0);
		System.out.println(punto2.getX());
		System.out.println(punto2.getY());
		System.out.println(circulo2.getCentro().getX());
		System.out.println(circulo2.getCentro().getY());
		
		System.out.println(circulo2.getCentro().getX());
		System.out.println(circulo2.getCentro().getY());
		System.out.println(circulo2.getRadio());
		System.out.println(circulo2.getPerimetro());
		
		circulo2.escalar(150);
		
		System.out.println(circulo2.getCentro().getX());
		System.out.println(circulo2.getCentro().getY());
		System.out.println(circulo2.getRadio());
		System.out.println(circulo2.getPerimetro());
		*/
		Rectangulo rectangulo = new Rectangulo(new Punto(3,1), new Punto(5,6));
		System.out.println(rectangulo.getVerticeII().getX());
		System.out.println(rectangulo.getVerticeII().getY());
		System.out.println(rectangulo.getVerticeSD().getX());
		System.out.println(rectangulo.getVerticeSD().getY());
		rectangulo.escalar(200);
		System.out.println(rectangulo.getVerticeII().getX());
		System.out.println(rectangulo.getVerticeII().getY());
		System.out.println(rectangulo.getVerticeSD().getX());
		System.out.println(rectangulo.getVerticeSD().getY());
		
		
	}

}
