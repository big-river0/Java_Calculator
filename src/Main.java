//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Calculator calc_add = new Calculator();

        calc_add.setNumbers(5,3);
        calc_add.add();
        calc_add.displayResult("+");

        Calculator calc_subtract = new Calculator();

        calc_subtract.setNumbers(5,3);
        calc_subtract.subtract();
        calc_subtract.displayResult("-");

        Calculator calc_multiply = new Calculator();

        calc_multiply.setNumbers(5,3);
        calc_multiply.multiply();
        calc_multiply.displayResult("*");

        Calculator calc_divide = new Calculator();

        calc_divide.setNumbers(5,3);
        calc_divide.divide();
        calc_divide.displayResult("/");
    }
}