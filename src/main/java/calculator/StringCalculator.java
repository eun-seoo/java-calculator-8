package calculator;

public class StringCalculator {
    public boolean isEmptyInput(String input){
        return input == null || input.isEmpty();
    }

    public String[] split(String input) {
        String delimiter = ",|:";
        // 슷자 부분을 구분자로 split -> tokens에는 숫자 문자열만 남도록
        String[] tokens = splitNumbers.split(delimiter);
        return tokens;
    }
}
