package Figuras_geo;

public class Triangulo extends Figuras {
//atributos

    private double altura;
    private double base;
  

//Metodo constructor
public Triangulo(double altura, double base) {
    this.altura = altura;
    this.base = base;
    //Metodos accesores
    
}


public double getAltura() {
    return altura;
}


public void setAltura(double altura) {
    this.altura = altura;
}


public double getBase() {
    return base;
}


public void setBase(double base) {
    this.base = base;
}

//Metodos propios 
public void calcularArea(){
    double area;
    double val1;
    val1=base*altura;
    area=val1/2;
    System.out.println("La base del triangulo es: "+base+"  y su altura es: "+altura+" y su area es "+area);
}


}
