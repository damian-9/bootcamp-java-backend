package clase_10_poo.ejercicio2;


public class Cuenta {
    private String titular;
    private float cantidad;

    public Cuenta() {

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrar(){
        System.out.println("Nombre del titular: "+ titular +
                "\ntiene la cantidad de: $" + cantidad);
    }

    public void ingresarCantidad(float cantidadIntroducida) {
        if (cantidadIntroducida > 0 ){
            cantidad += cantidadIntroducida;
        }

    }

    public void retirarCantidad(float cantidadARetirar) {
        cantidad -= cantidadARetirar;
    }
}
