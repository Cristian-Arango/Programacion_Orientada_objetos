package Salud;


public class Empleado extends Persona {


    //atributos propias de la subclase
    private String cargo;
    private double valorhora;
    private int horastrabajadas;
    private String departamento;

    //metodo constructor

    public Empleado(String tipoDoc, int documento, String nombre, String apellido, double peso, double altura, int edad,
            String sexo, String cargo, double valorhora, int horastrabajadas, String departamento) {
        super(tipoDoc, documento, nombre, apellido, peso, altura, edad, sexo);
        this.cargo = cargo;
        this.valorhora = valorhora;
        this.horastrabajadas = horastrabajadas;
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorhora() {
        return valorhora;
    }

    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }

    public int getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void mostrarempleado(){
        double reteica=0.966;
        double totalpagar=0;
        totalpagar=valorhora*horastrabajadas;
        totalpagar=(totalpagar-reteica);
System.out.println("El tipo de Documento es: "+getTipoDoc()+" Con numero "+getDocumento()+" ,Su nombre completo es "+getNombre()+" "+ getApellido()+" El cargo que cumple es "+cargo+" Las horas trabajadas son "+horastrabajadas+" y gana por hora "+valorhora+" Y el total a pagar es "+totalpagar);



    }










}
