public class Ex03_강제형변환 {

    public static void main(String[] args) {
        double score = 100; // double 자료형에 정수를 대입하면 자동 형변환이 발생하여 100.0이 된다.
        System.out.println(score);

        //강제로 형변환을 할 경우 변수앞에 변환하고자 하는 타입을 명시 
        int score2 = (int) score;
        System.out.println(score2);


        double pi = 3.141592D;
        System.out.println(pi);

        //실수타입을 정수로 변환할 경우 소수점 이하는 모두 버린다.
        int pint = (int) pi;
        System.out.println(pint);
    }
}