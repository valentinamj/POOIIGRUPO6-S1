/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto;
import java.util.List;
/**
 *
 * @author tracy
 */
public class main {
    public static void main(String[] args) {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(4, 0);
        Punto p3 = new Punto(0, 4);

        Triangulo triangulo = new Triangulo(p1, p2, p3);
        triangulo.setNombre("Triangulo");

        Superficie_Plana superficie = new Superficie_Plana();
        superficie.agregarFigura(triangulo);

        List<Double> areas = superficie.obtenerArea();
        for (Double area : areas) {
            System.out.println("Area del triangulo es: " + area+ "cm^2");
        }
        System.out.println("Regular:" + triangulo.esRegular());
        System.out.println(triangulo.toString());
    }
}
