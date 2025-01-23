import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LicuadoraTest {

    @Test
    void testEncender() {
        Licuadora lavadora = new Licuadora();
        
        lavadora.encender(); 
        assertTrue(lavadora.estado, "La licuadora debería estar encendida después de llamar a encender");
    }

    @Test
    void testVaciar() {
        Licuadora lavadora = new Licuadora();

        
        lavadora.llenar();
        assertTrue(lavadora.llenado, "La licuadora debería estar llena antes de vaciarla");

        
        lavadora.vaciar();
        assertFalse(lavadora.llenado, "La licuadora debería estar vacía después de llamar a vaciar");
    }

    @Test
    void testAumentarVelocidad() {
        Licuadora licuadora = new Licuadora();
        
        licuadora.encender();
        licuadora.llenar();
        licuadora.aumentarVelocidad();

        assertEquals(1, licuadora.consultarVelocidad(), "La velocidad deberia ser 1 depues de subirla por primera vez");



    }
}

