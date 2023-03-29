package Principal;
import java.util.Scanner;
import Salud.Empleado;

import Salud.Persona;
public class inicio {

public static void main(String[] args){

Scanner captura=new Scanner (System.in);
double altura,peso,imc;
    //instanciar la clase - crear el objeto 
    //invocar el metodo 
Persona information=new Persona();

information.pedirDatos();
information.mostrarPersona();

//information.calcularImc();

information.mayorEdad();
System.out.println("Porfavor ingrese Nuevamente su estatura");
altura=captura.nextDouble();

System.out.println("Porfavor ingrese Nuevamente su peso");
peso=captura.nextDouble();

imc=information.calcularImc(altura,peso); 
if (imc<20){
    System.out.println("Usted esta bajo de peso");
    }
    else if(imc>20 && imc<25){
        System.out.println("Usted esta bien de peso");

        }
        else if(imc>25){
            System.out.println("Usted tiene sobrepeso");
        }
            else{
                System.out.println("se calculo mal el imc");
            }


//RETO3
/*information.pedirDatos();
System.out.println("por favor digite el cargo");
String cargo=captura.next();
System.out.println("por favor digite el valor de hora");
double valorhora=captura.nextDouble();
System.out.println("por favor digite  las horas que trabaja");
int horastrabaja=captura.nextInt();
System.out.println("por favor digite el departmento");
String departamento=captura.next();


Empleado empley=new Empleado(information.getTipoDoc(),information.getDocumento(),information.getNombre(),information.getApellido(),information.getPeso(),information.getAltura(),information.getEdad(),information.getSexo(),cargo,valorhora,horastrabaja,departamento);
empley.mostrarempleado();
captura.close();*/

}




}



