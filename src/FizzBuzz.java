/**
 * Created by nsarsur on 9/19/16.
 */
public class FizzBuzz {
    private int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public boolean checkDivisibility(int number, int div){
        if(number%div==0)
            return true;
        else
            return false;

    }

    public void fizzBuzz(){

        for(int i=1; i<=n; i++){
            if(!checkDivisibility(i,3) && !checkDivisibility(i,5)) {
                System.out.println(i);
            }
            else {
                if(checkDivisibility(i,3)  && checkDivisibility(i,5)){
                    System.out.println("FizzBuzz");
                }
                else {
                    if(checkDivisibility(i,3)){
                        System.out.println("Fizz");
                    }
                    else
                        System.out.println("Buzz");
                }
            }
        }
    }

}
