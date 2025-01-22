import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        boolean i = true;

            Scanner input = new Scanner(System.in);
            Lavadora lavadora = new Lavadora();


            do {
                System.out.println("Elige las siguientes opciones:");
                System.out.println("1.Encender");
                System.out.println("2.Aumentar velocidad");
                System.out.println("3.Consultar velocidad actual");
                System.out.println("4.Llenar");
                System.out.println("5.Vaciar");
                System.out.println("6.consultar llenado actual");
                System.out.println("7.Apagar licuadora");
                System.out.println(" ");


                String opcion = input.nextLine();

                if (opcion.equals("1")) {
                    lavadora.encender();
                }if (opcion.equals("2")) {
                    lavadora.aumentarVelocidad();

                }if(opcion.equals("3")) {
                    lavadora.consultarVelocidad();
                    System.out.println("La velocidad actual es" +" "+ lavadora.consultarVelocidad());


                }
                if (opcion.equals("4")) {
                    lavadora.llenar();

                }if (opcion.equals("5")) {
                    lavadora.vaciar();
                }
                if (opcion.equals("6")) {
                    lavadora.consultarLlenado();
                }
                if (opcion.equals("7")) {
                   i=false;
                }
            }while(i == true);







    }
}