/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package valecita.actividad1;

/**
 *
 * @author milag
 */
public class Circulo {
    private double radio = 12.5;
    private String color = "azul";

    public Circulo() {
        this.radio = 12.5;
        this.color = "azul";    
    }
    public Circulo( double radio) {
        this.radio = radio;   
        this.color = "azul";
    }

    public double getRadio() {
        return radio;
    }
    
    public double getArea() {
        return radio * radio * Math.PI;
    }

    public String getColor() {
        return color;
    }
    
   public static void main(String[] args){
       
   }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color=" + color + '}';
    }
  
}