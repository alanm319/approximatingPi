package edu.gcccd.java;

import java.util.Random;

public class approximatingPi {

    public static double approximation(final long points){
        final Random random = new Random();
        long insideCircle = 0;
        for (long i =0; i< points; i++){
            double x = random.nextDouble();
            double y = random.nextDouble();
            if (Math.sqrt((x*x) + (y*y))<=1.0 ){
                insideCircle++;

            }
        }
        return  (double) ( 4.0*insideCircle / points);
    }
    public static void main(String[] args){
        System.out.println(approximation(1000000000));
    }
}
