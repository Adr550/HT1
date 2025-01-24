/**
 * Esta clase simula una licuadora con 
 * métodos para encenderla, aumentar la velocidad, llenar o vaciar 
 * su contenido y consultar su estado.
 */
public class Licuadora {
    int velocidad = 0; // Velocidad actual de la licuadora (0 a 10)
    boolean estado = false; // Estado de encendido/apagado
    boolean llenado = false; // Estado de llenado/vacío

    /**
     * Enciende la licuadora si está apagada.
     */
    public void encender() {
        if (!estado) {
            estado = true; // Cambia el estado a encendido
        }
    }

    /**
     * Aumenta la velocidad de la licuadora en 1 si está encendida y llena.
     */
    public void aumentarVelocidad() {
        if (estado && llenado) { // Verifica que la licuadora este encendida y llena
            if (velocidad < 10) { // Asegura que la velocidad no supere el maximo
                velocidad++; // Aumenta la velocidad por 1
            }
        }
    }

    /**
     * Consulta la velocidad actual de la licuadora.
     * 
     * @return La velocidad actual (entero).
     */
    public int consultarVelocidad() {
        return velocidad; // Retorna la velocidad actual
    }

    /**
     * Llena la licuadora si esta vacía.
     */
    public void llenar() {
        if (!llenado) { // Verifica que la licuadora esté vacía
            llenado = true; // Cambia el estado a lleno
        }
    }

    /**
     * Vacía la licuadora si está llena.
     */
    public void vaciar() {
        if (llenado) { // Verifica que la licuadora esté llena
            llenado = false; // Cambia el estado a vacío
        }
    }

    /**
     * Consulta el estado de llenado de la licuadora.
     * 
     * @return true si esta llena o false si está vacía.
     */
    public boolean consultarLlenado() {
        return llenado; // Retorna el estado de llenado
    }
}