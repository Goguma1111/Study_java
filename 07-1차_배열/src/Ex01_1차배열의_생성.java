public class Ex01_1차배열의_생성 {
    public static void main(String[] args) {
        /** 1) 배열의 선언과 할당 */    
        // 배열의 선언
        int[] arr1;

        arr1 = new int[3];


        System.out.println("arr1[0] = " + arr1[0]);
        System.out.println("arr1[1] = " + arr1[1]);
        System.out.println("arr1[2] = " + arr1[2]);
        System.out.println("--------------");



        /** 배열의 선언과 할당 일괄 처리 */
        // 4칸을 갖는 배열을 생성
        int[] arr2 = new int[4];

        // 배열의 각 칸에 값을 할당
        for (int i = 0; i< arr2.length; i++) {
            arr2[i] = i * 10;
            System.out.printf("arr2의 %d번째 칸 >> %d\n", i, arr2[i]);
        }

        System.out.println("------------");




        /** 3) 배열을 생성하면서 각 원소를 즉시 처리 */
        int[] arr3 = {100, 200, 300, 400};


        System.out.println(arr3);


        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    
    }
}
