package ejercicio3.servicios;

import ejercicio3.entidades.PasswordValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorServiceTest {

    PasswordValidatorService pvs;

    @BeforeEach
    void setUp() {
        pvs = new PasswordValidatorService();
    }

    @Test
    void longitudMinima() {
        assertTrue(pvs.longitudMinima(new PasswordValidator("asdfgasdfg")));
        assertFalse(pvs.longitudMinima(new PasswordValidator("asdf3")));
    }

    @Test
    void caracteresEspeciales() {

        assertTrue(pvs.caracteresEspeciales(new PasswordValidator("as34532%r34g")));
        assertFalse(pvs.caracteresEspeciales(new PasswordValidator("asdf3345nf")));
    }
    @Test
    void letraMayuscula() {

        assertTrue(pvs.letraMayuscula(new PasswordValidator("as34532%R34g")));
        assertFalse(pvs.letraMayuscula(new PasswordValidator("asdf3345nf")));
    }
}