/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author tracy
 */
public class Superficie_Plana {
    private List<Figura_Geometrica> figurasGeometricas;

    public Superficie_Plana() {
        this.figurasGeometricas = new ArrayList<>();
    }

    public void agregarFigura(Figura_Geometrica figura) {
        figurasGeometricas.add(figura);
    }

    public List<Double> obtenerArea() {
        List<Double> area = new ArrayList<>();
        for (Figura_Geometrica figura: figurasGeometricas) {
            area.add(figura.caculaAreaFigura());
        }
        return area;
    }
}   
