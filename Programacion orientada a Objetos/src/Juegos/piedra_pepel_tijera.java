package Juegos;

import java.util.Random;
import java.util.Scanner;

public class piedra_pepel_tijera implements Juego {

    //atributos 

    private String jugador;
    private int opcion;
    private int num; 

Scanner captura=new Scanner(System.in);

    public void iniciar() {
        System.out.println("Ingrese el nombre del jugador");
        jugador=captura.next();
    }

    public void jugar() {
        System.out.println("Jugador "+jugador+" Porfavor realice su eleccion \n 1. Piedra \n 2.Papel \n3.Tijeras");
        opcion=captura.nextInt();
        Random aleatorio=new Random();
        num=aleatorio.nextInt(3)+1;
        if (opcion == num) {
            System.out.println("QUEDARON EMPATADOS Porque la maquina escogio "+num);
        } else if ((opcion == 1 && num == 3) ||
                   (opcion == 2 && num == 1) ||
                   (opcion == 3 && num == 2)) {
            System.out.println("Ganaste, FELICITACIONES!Porque la maquina escogio "+num);
        } else {
            System.out.println("Perdiste, LO LAMENTAMOS Porque la maquina escogio "+num);
        }
    }

    public void finalizar() {
        
    }
    
}
