package Figuras_geo;

public class Rectangulo extends Figuras {
    //atributos 
    private double base;
    private double altura;
    //Constructor 
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

        //Metodos accesores

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void calcularArea(){
        double area;
        area=base*altura;
        System.out.println("La base del rectangulo es: "+base+"  La altura del rectangulo es: "+altura+" y Por ultimo su area es: "+area);
    }
}
