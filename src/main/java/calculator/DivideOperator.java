package calculator;

public class DivideOperator implements Operator{
    double result;
    @Override
    public double operate(int num1, int num2){
        result =(double)num1 / num2;
        return result;
    }
}