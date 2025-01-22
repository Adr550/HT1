public class Lavadora {
    int velocidad = 0;
    boolean estado = false;

    public void encender() {
        if (estado == false) {
            estado = true;
            System.out.println("La lavadora esta encendida");
        } else {
            System.out.println("La lavadora ya estaba encendida");
        }

    }
    public void aumentarVelocidad() {
        if (estado == false) {
            System.out.println("La lavadora tiene que estar encendida");
        }else{
            velocidad++;
        }
    }

}