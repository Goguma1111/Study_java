public class Ex04_연산결과_형변환 {
    public static void main(String[] args) {
        
        int x = 100;
        int y = 50;
        System.out.println(x+y);


        // 서로 다른 타입의 연산 결과는 더 큰 범위의 데이터 타입으로 결과가 생성
        double m = 123.45;
        int n = 67;
        System.out.println(m+n);


        int i = 10;
        int j = 20;
        double k = i+j;

        System.out.println(k);



        int a = (int)(10.2+3.1);
        System.out.println(a);



    }
    
}