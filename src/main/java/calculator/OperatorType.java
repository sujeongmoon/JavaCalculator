package calculator;

public enum OperatorType {
    ADD, SUB, MUL, DIV, MOD;

    //연산자를 확인하고 알맞은 클래스로 연결해주는 메소드 -> enum에도 메소드가 들어갈 수 있다!
    public double operatorTypeCal(int num1, int num2, OperatorType type){
        if (type == ADD){ //equlas 안 쓰고 이렇게 ==하면 되나? enum이니까?
            return new AddOperator().operate(num1, num2);
        } else if (type == SUB){
            return new SubtractOperator().operate(num1, num2);
        } else if (type == MUL){
            return new MultiplyOperator().operate(num1, num2);
        } else if (type == DIV){
            return new DivideOperator().operate(num1, num2);
        } else if (type == MOD){
            return new ModOperator().operate(num1, num2);
        }
        return 0;
    }
}
