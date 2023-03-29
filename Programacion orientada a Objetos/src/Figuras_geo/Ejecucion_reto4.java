package Figuras_geo;

import java.util.Scanner;

public class Ejecucion_reto4 {
    
    public static void main(String[] args) {
        double base,altura,radio,pi;
        String Figura;
        Scanner captura=new Scanner(System.in);
        String opcion;
        int  i=0;


        System.out.println("Bienvenido al juego");
do{ 
        System.out.println("Porfavor digite el nombre de la figura geometria que desea calcular el area, esta rectangulo, circulo y triangulo (Porfavor digitelo en minuscula)");
        Figura=captura.next();

        switch(Figura){
            case "triangulo":
            System.out.println("Por favor digite la base del triangulo");
            base=captura.nextFloat();
            System.out.println("Por favor digite la altura del triangulo");
            altura=captura.nextFloat();
            Triangulo tr=new Triangulo(altura, base);
            tr.calcularArea();
                break;

                case "rectangulo":
                System.out.println("Por favor digite la base del rectangulo");
                base=captura.nextFloat();
                System.out.println("Por favor digite la altura del rectangulo");
                altura=captura.nextFloat();
                Rectangulo re=new Rectangulo(base, altura);
                re.calcularArea();
                    break;

                    
                    case "circulo":
                    System.out.println("Por favor digite el radio del circulo");
                    radio=captura.nextDouble();
                    System.out.println("Por favor ingrese los primeros 4 digitos de pi");
                    pi=captura.nextDouble();
                    Circulo cr=new Circulo(radio, pi);
                    cr.calcularArea();
                        break;

                        default:
                        System.out.println("DATO ERRONEO");



        }
        i=i+1;

        System.out.println("Si desea volver a ejecutar el programa escriba si en mayuscula, en caso contrario escriba no");
        opcion=captura.next();

    }while(opcion.equals("SI"));
        



captura.close();


    }
}
