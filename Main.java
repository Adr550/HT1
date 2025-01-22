import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lavadora lavadora = new Lavadora();
        System.out.println("Elige las siguientes opciones:");
        System.out.println("1.Encender");
        System.out.println("2.Ajustar velocidad");
        String opcion = input.nextLine();

        if (opcion.equals("1")) {
            lavadora.encender();
        }if (opcion.equals("2")) {
            lavadora.aumentarVelocidad();

        }



    }
}
