public class Ex01_자동형변환 {
    public static void main(String[] args) {
        // 자동 형변환
        int number = 10;
        long number2 = number;
        System.out.println(number2);


        // 자동형변환의 예외상황
        // 메모리의 크기보다 값의 표현을 중요시 함

        // float로의 변환은 권장하지 않음 
        // double을 사용할것
        float number3 = number2;
        System.out.println(number3);
    }
}
