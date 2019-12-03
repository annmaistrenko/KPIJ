package com.company;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void isOk() {
        assertFalse(Main.isOk("asdnjkfkd"));
        assertTrue(Main.isOk("sdfga"));
    }

    @org.junit.jupiter.api.Test
    void form() {
        String [] input = {"as","dgdhhh"};
        String [] output = {"as"};
        String [] input1 = {"ssss","dgdhhh"};
        String [] output2 = {};
        assertArrayEquals(Main.form(input),output);
        assertArrayEquals(Main.form(input1),output2);

    }
}