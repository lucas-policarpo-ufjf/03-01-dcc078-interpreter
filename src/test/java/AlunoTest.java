
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Cliente cliente = new Cliente("Lucas", 1.0d);

        assertEquals(250.0d, cliente.calcularEmprestimo(500.0d));
    }

}