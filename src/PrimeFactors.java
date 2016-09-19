/**
 * Created by nsarsur on 9/19/16.
 */

import java.util.ArrayList;

public class PrimeFactors {
    private int n;
    private ArrayList prime_factors = new ArrayList();

    public PrimeFactors(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ArrayList calculatePrimeFactors() {
        int aux = n;
        boolean flag = false;

        while (aux > 1) {
            for (int i = 2; i <= aux; i++) {
                if (aux % i == 0) {
                    for (int a = 0; a < prime_factors.size(); a++) {
                        if (prime_factors.get(a).equals(i)) {
                            aux = aux / i;
                            flag = true;
                            break;
                        }
                    }
                    if (flag == false) {
                        prime_factors.add(i);
                        aux = aux / i;
                        flag = true;
                        break;
                    }
                }
                flag = false;
            }
        }
        return prime_factors;
    }

    public void show(ArrayList prime_factors){
        if(prime_factors.size() == 0){
            System.out.println("Empty!");
        }
        else {
            for (int a = 0; a < prime_factors.size(); a++) {
                System.out.println(prime_factors.get(a));
            }
        }

    }
}
