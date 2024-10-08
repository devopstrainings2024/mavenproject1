package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testApp() {
        App app = new App();
        String result = app.getMessage();
        assertEquals("Hello, World!", result);
    }
}