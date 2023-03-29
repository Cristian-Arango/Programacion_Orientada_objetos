package Salud;

import java.util.Scanner;

public class Persona {
    public String tipoDoc;
    public int documento;
    public String nombre;
    public String apellido;
    public double peso;
    public double altura;
    public int edad;
    public String sexo;

    //Metodos
    //geter y seders
    

    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
        
    }

        //Metodo constructor 

        public Persona(){

          }       


    //metodo constructor con paramertrops 
    public Persona(String tipoDoc, int documento, String nombre, String apellido, double peso, double altura,
                int edad, String sexo) {
            this.tipoDoc = tipoDoc;
            this.documento = documento;
            this.nombre = nombre;
            this.apellido = apellido;
            this.peso = peso;
            this.altura = altura;
            this.edad = edad;
            this.sexo = sexo;
        }
    //modificador de acceso+valor de retorno del metodo +parametros
    public void pedirDatos(){
        Scanner captura=new Scanner(System.in);
        System.out.println("Por favor ingrese su tipo de documento ");
        tipoDoc=captura.next();
        System.out.println("Por favor ingrese su numero de documento ");
        documento=captura.nextInt();
        System.out.println("Por favor ingrese su nombre");
        nombre=captura.next();
        System.out.println("Por favor ingrese su apellido ");
        apellido=captura.next();
        System.out.println("Por favor ingrese su peso ");
        peso=captura.nextDouble();
        System.out.println("Por favor ingrese su altura ");
        altura=captura.nextDouble();
        System.out.println("Por favor ingrese su edad ");
        edad=captura.nextInt();
        System.out.println("Por favor ingrese su tipo de sexo (M=Masculino - F=Femenino) ");
        sexo=captura.next();


    }


    
public void mostrarPersona(){
    System.out.println("Su tipo tipo de documento es: "+tipoDoc);
    System.out.println("Su numero de documento es: "+documento);
    System.out.println("Su nombre es: "+nombre);
    System.out.println("Su apellido es: "+apellido);
    System.out.println("Su peso es: "+peso);
    System.out.println("Su altura es: "+altura);
    System.out.println("Su edad es: "+edad);
    System.out.println("Su sexo es: "+sexo);
}

public void calcularImc(){
double imc=peso/altura/altura;
if(imc<20){
    System.out.println("El peso esta por debajo de lo ideal, su indice mde masa corporal es: "+imc);
}
        else if(imc>20){ 
                if(imc<25){
                    System.out.println("El peso es ideal, su indice mde masa corporal es: "+imc);
                }
                else{
                    System.out.println(" Tiene sobrepeso, su indice mde masa corporal es: "+imc);
                }
            }

  else{
    System.out.println("ERROR");
  }          
}

/*public double calcularImc(double altura,double peso){    //Este es para el reto 2
    double imc;
    imc=(peso/altura/altura);
    System.out.println("Su IMC es: "+imc);
    return imc;
}
*/

    public void mayorEdad(){
            if(edad>=18){
                    System.out.println("Usted es mayor de edad");
            }
            else {
                    System.out.println("Usted es menor de edad ");
            }
    }
}
