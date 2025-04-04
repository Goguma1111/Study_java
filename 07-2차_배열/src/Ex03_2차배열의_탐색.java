public class Ex03_2차배열의_탐색 {
    public static void main(String[] args) {
        int[][] foo = {{1,2,3}, {10,20,30}};


        // 부모 반복문은 2차 배열의 행에 관여
        for(int i = 0; i < foo.length; i++){
            System.out.printf("%d번째의 행\n",i);

            //foo[i]번째는 가각 독립적인 1차 배열이므로 그 자체로 탐색이 가능
            for (int j = 0; j< foo[i].length; j++) {
                System.out.printf("\t %d번째의 열: %d\n", j, foo[i][j]);
            }
        }
    }
}
