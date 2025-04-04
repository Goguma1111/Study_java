public class Ex07_주사위_두_눈의_합 {
    public static void main(String[] args) {
    
    // 조건에 맞는 경우를 카운트 하기 위한 변수
    
    int count = 0;


    // 첫 번째 주사위를 의미하는  for문    
    for (int i = 1; i <7; i++) {
        // 두 번째 주사위를 의미하는 for문
        for(int j = 1; j < 7; j++) {
            // 두 주사위의 합이 6이 되는 경우만 선별
            if (i + j == 6) {
                System.out.printf("[%d, %d]\n", i ,j);
                count++;
            }


        }
    
    }

    System.out.printf("경우의 수는 %d개 입니다.\n", count);    

    }

}