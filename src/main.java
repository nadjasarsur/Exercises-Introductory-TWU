/**
 * Created by nsarsur on 9/19/16.
 */

import java.util.Random;


public class main {


    public static void main(String [] args) {
        System.out.println("Exercises TWU - Introductory programming exercises");
        Random rand = new Random();
        Triangle triangle = new Triangle(rand.nextInt(10));
        triangle.easestExercise();
    }
}
