package calculator;

public enum OperatorType {
    ADD, SUB, MUL, DIV, MOD;

    //연산자를 확인하고 알맞은 클래스로 연결해주는 메소드 -> enum에도 메소드가 들어갈 수 있다!
    public <T extends Number> double operatorTypeCal(T num1, T num2, OperatorType type){
        if (type == ADD){ //equlas 안 쓰고 이렇게 ==하면 되나? enum이니까?
            return new AddOperator().operate((double)num1, (double)num2);
        } else if (type == SUB){
            return new SubtractOperator().operate((double)num1, (double)num2);
        } else if (type == MUL){
            return new MultiplyOperator().operate((double)num1, (double)num2);
        } else if (type == DIV){
            return new DivideOperator().operate((double)num1, (double)num2);
        } else if (type == MOD){
            return new ModOperator().operate((double)num1, (double)num2);
        } // 3-2 다 double로 형변환을 해줘야 하는 불편한 코드가 만들어진 것 같다.. T object끼리는 연산자 적용이 안 돼서 형변환을 해준 것.
        return 0;
    }
}
