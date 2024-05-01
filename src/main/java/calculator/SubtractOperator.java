package calculator;

public class SubtractOperator implements Operator{
    double result;
    @Override
    public double operate(double num1, double num2){
        result = num1 - num2;
        return result;
    }
}