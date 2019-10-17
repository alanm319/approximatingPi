package edu.gcccd.java;


import org.junit.Test;

import static org.junit.Assert.*;


public class approximatingPiTest{


    @Test
    public void approximation() {
       double d = approximatingPi.approximation(10000);
        assertTrue(3.141 < d && d > 3.142);
    }


}
