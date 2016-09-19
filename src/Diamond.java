/**
 * Created by nsarsur on 9/19/16.
 */
public class Diamond {

    private int n;

    Diamond(int n)
    {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void isosceles(int n){
        for (int i = 0; i < n ; i++){
            for (int b=i; b<n-1; b++){
                System.out.print(" ");

            }
            for (int a = 0; a <= i*2; a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void isoscelesInverted(int n){
        for (int i = n; i > 1 ; i--){
            for (int b=0; b<n-i+1; b++){
                System.out.print(" ");

            }
            for (int a = 2; a < i*2-1; a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void diamond(int n){
        isosceles(n);
        isoscelesInverted(n);
    }
}
