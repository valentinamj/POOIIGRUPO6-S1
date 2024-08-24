/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto;

/**
 *
 * @author tracy
 */
public abstract class Figura_Geometrica {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreFigura) {
        this.nombre = nombreFigura;
    }

    public abstract double caculaAreaFigura(); //metodos declarados pero no implementados   

    public abstract boolean esRegular();  // entonces, sugiere abstraccion en el diagrama.

}
