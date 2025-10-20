package calculator;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        StringCalculator calculator = new StringCalculator();
        OutputView outputView = new OutputView();

        // 예외 처리
        try{
            String input = inputView.readInput();
            int sum = calculator.calculator(input);
            outputView.output(sum);
        }catch(IllegalArgumentException e) {
            outputView.printError(e.getMessage());
        }
    }
}
