/**
 * Created by nsarsur on 9/19/16.
 */

import java.util.Random;
import java.util.ArrayList;

public class main {


    public static void main(String [] args) {
        int n;
        System.out.println("Exercises TWU - Introductory programming exercises");
        System.out.println("*** Triangle Exercises ***");
        Random rand = new Random();
        n = rand.nextInt(9)+1;
        Triangle triangle = new Triangle(n);
        System.out.println("\t - First exercise (Print Asterisk):");
        triangle.easestExercise();
        System.out.println("\t - Second exercise (Horizontal Line): N = "+n);
        triangle.horizontalLine(n);
        n = rand.nextInt(9)+1;
        System.out.println("\t - Third exercise (Vertical Line): N = "+n);
        triangle.verticalLine(n);
        n = rand.nextInt(9)+1;
        System.out.println("\t - Fourth exercise (Right Triangle): N = "+n);
        triangle.rightTriangle(n);

        System.out.println("\n\n*** Diamond Exercises ***");
        Diamond diamond = new Diamond(n);
        n = rand.nextInt(9)+1;
        System.out.println("\t - Fifth exercise (Isosceles): N = "+n);
        diamond.isosceles(n);
        n = rand.nextInt(9)+1;
        System.out.println("\t - Sixth exercise (Isosceles): N = "+n);
        diamond.diamond(n);
        n = rand.nextInt(9)+1;
        System.out.println("\t - Seventh exercise (Diamond with Name): N = "+n);
        diamond.diamondWithName(n,"Nadja");

        System.out.println("\n\n*** FizzBuzz Exercises ***");
        FizzBuzz fizzbuzz = new FizzBuzz(100);
        fizzbuzz.fizzBuzz();

        n = rand.nextInt(300)+1;
        System.out.println("\n\n*** Prime Factors "+n+" ***");
        PrimeFactors prime  = new PrimeFactors(n);
        ArrayList primeList = new ArrayList(prime.calculatePrimeFactors());
        prime.show(primeList);

    }
}
