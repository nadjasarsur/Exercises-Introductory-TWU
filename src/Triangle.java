/**
 * Created by nsarsur on 9/19/16.
 */
public class Triangle {

    private int n;

    Triangle(int n)
    {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void easestExercise(){
        System.out.println("*");
    }

    public void horizontalLine(int n){
        for (int i = 0; i < n ; i++){
            System.out.print("*");
        }
        System.out.println();

    }

    public void verticalLine(int n){
        for (int i = 0; i < n ; i++){
            System.out.println("*");
        }
    }

    public void rightTriangle(int n){
        for (int i = 0; i < n ; i++){
            for(int a = 0; a <= i; a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
