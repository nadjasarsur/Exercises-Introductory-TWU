/**
 * Created by nsarsur on 9/19/16.
 */

import java.util.Random;


public class main {


    public static void main(String [] args) {
        int n;
        System.out.println("Exercises TWU - Introductory programming exercises");
        System.out.println("*** Triangle Exercises ***");
        Random rand = new Random();
        n = rand.nextInt(9)+1;
        Triangle triangle = new Triangle(n);
        System.out.println("\t - First exercise:");
        triangle.easestExercise();
        System.out.println("\t - Second exercise: N = "+n);
        triangle.horizontalLine(n);
        n = rand.nextInt(9)+1;
        System.out.println("\t - Third exercise: N = "+n);
        triangle.verticalLine(n);
        n = rand.nextInt(9)+1;
        System.out.println("\t - Fourth exercise: N = "+n);
        triangle.rightTriangle(n);

    }
}
