public class Ex02_CharType {
    public static void main(String[] args) {
        
    // char 타입의 값을 할당할때는 홀따옴표로 바꾼다.
    char a = 'A';
    System.out.println(a);

    // 'A'에 해당하는 아스키코드로 자동 변환된다.
    int b = a;
    System.out.println(b);

    //아스키 코드 66이 의미하는 글자로 자동 변환된다.
    char c = 66;
    System.out.println(c);
    


    // char 타입의 변수는 정수로 인식되기 때문에 연산이 가능
    int B = 'A' + 1;
    int C = 'A' + 2;
    int D = 'A' + 3;

    System.out.printf("B = %s, C = %s, D = %s",B,C,D);

    }
}
