package Figuras_geo;

public class Circulo {
    //atributos 
    private double radio;
    private double pi;
    //Metodo Constructor 
    public Circulo(double radio, double pi) {
        this.radio = radio;
        this.pi = pi;
    }
    //Metodos accesores 
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getPi() {
        return pi;
    }
    public void setPi(double pi) {
        this.pi = pi;
    }
    
//Metodos propios 
public void calcularArea(){
    double area;
    double val1;
    val1=radio*radio;
    area=pi*val1;
    System.out.println("El valor del radio del circulo  es: "+radio+ " Y su area es: "+area);
}
}