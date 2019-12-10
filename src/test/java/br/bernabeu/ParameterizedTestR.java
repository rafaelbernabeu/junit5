package br.bernabeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestR {

    @ParameterizedTest
    @ValueSource(strings = {"name-0", "name-1", "name-2"})
    public void printTest(String name) {
        Assertions.assertNotNull(name);
        System.out.println(name);
    }

}
