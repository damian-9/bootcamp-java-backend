package clase_10_poo.ejercicio1;

import java.time.LocalDate;

public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;
    private String DNI;

    public Persona() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento +
                ", DNI='" + DNI + '\'' +
                ", Es mayor de edad=" + esMayorDeEdad()+
                '}';
    }


    public boolean esMayorDeEdad(){
        boolean mayorDeEdad;
        mayorDeEdad = edad > 18;
        return  mayorDeEdad;
    }
}
