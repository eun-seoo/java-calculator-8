package calculator;

import camp.nextstep.edu.missionutils.Console;
import java.lang.*;

public class InputView {
    public String readInput() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");

        String input = Console.readLine();
        return input;
    }
}
