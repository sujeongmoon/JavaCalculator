package calculator;

public class ModOperator implements Operator{
    double result;
    @Override
    public double operate(int num1, int num2){
        result = num1 % num2;
        return result;
    }
}
