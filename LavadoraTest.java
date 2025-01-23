import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LavadoraTest {

    @Test
    void testEncender() {
        Lavadora lavadora = new Lavadora();
        
        lavadora.encender(); 
        assertTrue(lavadora.estado, "La licuadora debería estar encendida después de llamar a encender");
    }

    @Test
    void testVaciar() {
        Lavadora lavadora = new Lavadora();

        
        lavadora.llenar();
        assertTrue(lavadora.llenado, "La licuadora debería estar llena antes de vaciarla");

        
        lavadora.vaciar();
        assertFalse(lavadora.llenado, "La licuadora debería estar vacía después de llamar a vaciar");
}
}

