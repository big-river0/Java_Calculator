public class Advanced_Calculator extends Calculator {
    // 계산기 v2.0 개발
    // 이슈: https://github.com/big-river0/Java_Calculator/issues

    // 곱셈 연산자로 두수 곱하기 완료
    //https://github.com/big-river0/Java_Calculator/issues/2
    @Override
    public int multiply() {
        result = num1 * num2;
        return result;
    }

    //나눗셈 연산자로 두 수 나누기 완료
    //https://github.com/big-river0/Java_Calculator/issues/3
    @Override
    public int divide() {
        result = num1 / num2;
        return result;
    }
}
