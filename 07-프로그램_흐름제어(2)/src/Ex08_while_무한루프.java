public class Ex08_while_무한루프 {
    public static void main(String[] args) {

        /** while 문의 조건 설정 오류 */
        // while문의 조건이 항상 참으로 판단되는 경우
        // --> 출력 중지하기 : 출ㄹ력창을 선택한 상태에서 ctrl +c --> cancel
        int num =1;
        while (true) {
            System.out.println("Hello world >>" + num);
        }
    }
}
