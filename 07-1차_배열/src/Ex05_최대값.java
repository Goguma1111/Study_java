public class Ex05_최대값 {
    public static void main(String[] args) {
        //원소값을 무작위로 갖는 배열
        int [] data = {5,2,7,9,2};

        // 비교를 위해 배열의 0 번째 원소를 복사해 둔다
        int max = data[0];


        //0번째 이후부터 탐색을 시작
        for (int i = 1; i < data.length; i++){
        


            // max가 data의 i번째 데이터보다 작다면 i번째 원소를 max에 복사
            if(max < data[i]) {
                max = data[i];
            }
        }

        System.out.println("최대값 = " + max);
    }
}
