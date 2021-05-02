import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancoTest {
    Banco bd= new Banco();
    @Test
    void deposito() {
        assertEquals(false,bd.deposito(-80));
    }

    @Test
    void saque() {
        assertEquals(false,bd.deposito(-80));
    }

    @Test
    void saldo() {
    }
}