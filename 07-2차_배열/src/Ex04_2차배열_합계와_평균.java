public class Ex04_2차배열_합계와_평균 {
    public static void main(String[] args) {
        String[] names = {"철수", "영희", "민혁"};


        int[][] grade = {
            {92, 81, 76},
            {72,95,84},
            {80,86,98}};


        // 이 위치에서의 변수는 2차 배열의 모든 원소에 대한 합계를 의미
        int sum = 0;
        
        // 성적배열의 행에 대한 탐색 --> 학생별을 의미
        for(int i = 0; i<grade.length; i++) {
            // 행단위의 합계는 새로운 행이 시작될 때 마다 변수를 새로 생성
            // --> 개인별 합계
            int personalSum = 0;

            // 성적 배열의 i번째 행에 대한 열을 탐색 --> 특정 학생의 과목별 점수
            for (int j = 0; j < grade[i].length; j++) {
                sum += grade[i][j];
                personalSum += grade[i][j];

            }

            int personalAvg = personalSum / grade[i].length;
            System.out.printf("%d번째 행에 대한 %s의 합계: %d, 평균 : %d\n",
                                    i, names[i],personalSum,personalAvg);
        }

        System.out.printf("모든 원소에 대한 전체 합계 %d\n", sum);
    }
}
