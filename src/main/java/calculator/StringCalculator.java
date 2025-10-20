package calculator;

public class StringCalculator {
    public boolean isEmptyInput(String input){
        return input == null || input.isEmpty();
    }

    public String[] split(String input) {
        String delimiter = ",|:";
        String splitNumbers = input; //커스텀 구분자가 있을 때/ 없을 때 로직 분기

        // 커스텀 구분자 분리 기능
        if(input.startsWith("//")){
            int newlineIndex = input.indexOf('\n');

            // '\n'이 없으면 잘못된 형식 처리
            if (newlineIndex == -1) {
                throw new IllegalArgumentException("잘못된 구분자 형식입니다. (예: //;\\n1;2;3)");
            }

            delimiter = input.substring(2, newlineIndex);
            splitNumbers = input.substring(newlineIndex + 1);  // "\n" 이후 문자열을 숫자 부분으로 인식
        }
        // 슷자 부분을 구분자로 split -> tokens에는 숫자 문자열만 남도록
        String[] tokens = splitNumbers.split(delimiter);
        return tokens;
    }

    public void validateNegative(String[] numbers){
        for (String s : numbers){
           int value = Integer.parseInt(s);
           if(value < 0){
               throw new IllegalArgumentException("음수는 입력할 수 없습니다.");
           }
        }
    }

    public int sum(String[] tokens){
        int sum = 0;

        for(String s : tokens){
            int number = Integer.parseInt(s); //parseInt는 integer 객체의 메서드
            sum += number;
        }
        return sum;
    }

}
