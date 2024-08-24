/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto;

/**
 *
 * @author tracy
 */
public class Punto {

    private int coordenada_x;
    private int coordenada_y;

    public Punto(int x, int y) {
        this.coordenada_x = x;
        this.coordenada_y = y;
    }

    public Punto() {
        this.coordenada_x = 0;
        this.coordenada_y = 0;
    }

    public int getCoordenada_x() {
        return coordenada_x;
    }

    public int getCoordenada_y() {
        return coordenada_y;
    }

    public void setCoordenada_x(int coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public void setCoordenada_y(int coordenada_y) {
        this.coordenada_y = coordenada_y;
    }

    public double getDistancia() {
        return getDistance(new Punto(0,0));
    }

    public double getDistance(Punto otroPunto) {
        int deltaX = this.coordenada_x - otroPunto.coordenada_x;
        int deltaY = this.coordenada_y - otroPunto.coordenada_y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);

    }

    @Override
    public String toString() {
        return "El punto tiene las siguientes coordenadas:" + coordenada_x + ", " + coordenada_y;
    }

}
