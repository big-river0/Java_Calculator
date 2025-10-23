public class Advanced_Calculator_2 extends Calculator{
    // 계산기 v3.0 개발
    // 이슈: https://github.com/big-river0/Java_Calculator/issues

    // 거듭제곱 연산자로 두 수 거듭제곱하기 완료
    //https://github.com/big-river0/Java_Calculator/issues/10
    public int power(){
        result = 1;
        for (int i = 0; i < num2; i++){
            result *= num1;
        }
        return result;
    }
}
