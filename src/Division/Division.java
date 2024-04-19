package Division;

public class Division {
   public double divideNumbers(int a, int b) throws DivisionByZeroException{
       if (b == 0) {
           throw new DivisionByZeroException("You can't divide by zero...");
       } return a/b;
   }
}
