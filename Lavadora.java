public class Lavadora {
    int velocidad = 0;
    boolean estado = false;
    boolean llenado = false;

    public void encender() {
        if (estado == false) {
            estado = true;
            System.out.println("La licuadora esta encendida");
        } else {
            System.out.println("La licuadora ya estaba encendida");
        }

    }
    public void aumentarVelocidad() {
        if (estado == true && llenado == true) {
            velocidad++;
            System.out.println("Aumentando velocidad");

        }else{
            System.out.println("La licuadora tiene que estar encendida y llena");
        }
        if (velocidad == 10){
            System.out.println("La velocidad máxima es 10");
        }
    }
    public int consultarVelocidad() {
        return velocidad;

    }
    public void llenar() {
        if (llenado == false) {
        System.out.println("llenando licuadora....");
        llenado = true;}
        else{
            System.out.println("La licuadora ya estaba llena");
        }
    }
    public void vaciar(){
        if (llenado == true) {
        System.out.println("vaciando licuadora....");
        llenado = false;
        }else{
            System.out.println("la licuadora ya estaba vacia");
        }
    }
    public boolean consultarLlenado() {
        if (llenado == true) {
            System.out.println("la licuadora se encuentra llena");
        }
        if (llenado == false) {
            System.out.println("La licuadora se encuentra vacía");
        }
        return llenado;
    }


}
