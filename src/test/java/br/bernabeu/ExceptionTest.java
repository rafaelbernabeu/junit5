package br.bernabeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    public void nullPointertest() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            String name = null;
            name.concat("");
        });
    }

}
