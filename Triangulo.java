/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto;

/**
 *
 * @author tracy
 */
public class Triangulo extends Figura_Geometrica {

    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo(){
        super();// inicialización
        this.punto1 = new Punto();
        this.punto2 = new Punto();
        this.punto3 = new Punto();
    }
    public Triangulo(Punto p1, Punto p2, Punto p3) {
        super();
        this.punto1 = p1;
        this.punto2 = p2;
        this.punto3 = p3;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    public double caculaAreaFigura() {
        double a = punto1.getDistance(punto2);
        double b = punto2.getDistance(punto3);
        double c = punto3.getDistance(punto1);
        double r = (a + b + c) / 2;
        return Math.sqrt(r * (r - a) * (r - b) * (r - c));
    }

    public boolean esRegular() {
        double a = punto1.getDistance(punto2);
        double b = punto2.getDistance(punto3);
        double c = punto3.getDistance(punto1);
        return a == b && b == c;
    }

    @Override
    public String toString() {
        return "Triangulo: " + getNombre() + " Tiene 3 puntos: " + getPunto1().toString() + ", "+getPunto2().toString()+ ", "+getPunto3().toString();
        
    }

}
