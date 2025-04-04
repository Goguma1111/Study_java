public class Ex04_배열_뒤집기 {
   public static void main(String[] args) {
    int[] data = {1, 5, 2, 4, 3};

    //반복 횟수는 "배열의 길이 / 2"
    for (int i = 0; i <data.length / 2; i++) {
        // i번째에 대한 반대쪽 원소의 인덱스

        int k = data.length - i -1;

        // 배열의 i번째와 k번째를 교환하기 위한 swap처리

        int tmp = data[i];
        data[i] = data[k];
        data[k] = tmp;

    }


    //배열의 전체원소 출력

    for (int i = 0; i<data.length; i++){
        System.out.print(data[i] + "\t");
    }
   } 
}
