package calculator;

import camp.nextstep.edu.missionutils.Console;
import java.lang.*;

public class InputView {
    public String readInput() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();
        // 사용자가 입력한 \\n을 실제 줄바꿈 문자로 변환
        return input.replace("\\n", "\n");
    }
}
