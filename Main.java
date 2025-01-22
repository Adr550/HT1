import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        boolean i = true;

            Scanner input = new Scanner(System.in);
            Lavadora lavadora = new Lavadora();


            do {
                System.out.println("Elige las siguientes opciones:");
                System.out.println("1.Encender");
                System.out.println("2.Ajustar velocidad");
                System.out.println("3.Terminar programa");
                String opcion = input.nextLine();

                if (opcion.equals("1")) {
                    lavadora.encender();
                }if (opcion.equals("2")) {
                    lavadora.aumentarVelocidad();
                }
                if (opcion.equals("3")) {
                    i = false;
                }
            }while(i == true);







    }
}