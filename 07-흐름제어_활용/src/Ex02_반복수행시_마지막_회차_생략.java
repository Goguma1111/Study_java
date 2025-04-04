public class Ex02_반복수행시_마지막_회차_생략 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            // 조건값이 if문이 아닌 경우에만 실행하도록 if문 구성
            // [공식1] 조건식이 "변수 < 최대값"인 경우 -> 변수 + 1 < 최대값
            // [공식2] 조건식이 "변수 < = 최대값"인 경우 -> 변수 < 최대값

            if (i +1 < 10) {
                System.out.println("i=" + 1);
            }

        }
    }
}
