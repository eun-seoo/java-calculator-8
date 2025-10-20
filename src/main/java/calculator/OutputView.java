package calculator;

import java.lang.*;

public class OutputView {
    public void output(int sum){
        System.out.println("결과 : " + sum);
    }

    public void printError(String message){
        System.out.println("오류 : " + message);
    }
}
