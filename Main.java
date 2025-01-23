import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean x = true;

        Scanner input = new Scanner(System.in);
        Licuadora licuadora = new Licuadora();

        do { //se añade case break en lugar ifs y se mantiene el do while 
            System.out.println("Elige las siguientes opciones:");
            System.out.println("1. Encender");
            System.out.println("2. Aumentar velocidad");
            System.out.println("3. Consultar velocidad actual");
            System.out.println("4. Llenar");
            System.out.println("5. Vaciar");
            System.out.println("6. Consultar llenado actual");
            System.out.println("7. Apagar licuadora");
            System.out.println();

            String opcion = input.nextLine(); //se crea objeto de input para el usuario

            switch (opcion) { 
                case "1":
                    if (!licuadora.estado) { 
                        licuadora.encender();
                        System.out.println("Licuadora encendida.");
                    } else {
                        System.out.println("La licuadora ya estaba encendida."); //este else está por si la licuadora ya había hecho dicha acción 
                    }
                    break;
                case "2":
                    if (licuadora.estado && licuadora.llenado) {
                        licuadora.aumentarVelocidad();
                        System.out.println("Velocidad aumentada");
                        } else {
                            System.out.println("La licuadora tiene que estar encendida y llena.");  // se debe cumplir que la licuadora esté llena y encendida
                    }
                    break;
                case "3":
                    System.out.println("La velocidad actual es " + licuadora.consultarVelocidad()); 
                    break;
                case "4":
                    if (!licuadora.llenado) { //condición si el valor de llenado es falso
                        licuadora.llenar();
                        System.out.println("Licuadora llenada.");
                    } else {
                        System.out.println("La licuadora ya estaba llena.");
                    }
                    break;
                case "5":
                    if (licuadora.llenado) {
                        licuadora.vaciar();
                        System.out.println("Licuadora vaciada.");
                    } else {
                        System.out.println("La licuadora ya estaba vacia.");
                    }
                    break;
                case "6":
                    if (licuadora.consultarLlenado()) {
                        System.out.println("La licuadora esta llena.");
                    } else {
                        System.out.println("La licuadora está vacia.");
                    }
                    break;
                case "7":
                    x = false;
                    System.out.println("Apagando licuadora ");
                    break;
                default:
                    System.out.println("Opcion invalida ");
                    break; //la última opción hace que la variable x sea falsa y termina el progama
            }
        } while (x);

        input.close();
    }
}
