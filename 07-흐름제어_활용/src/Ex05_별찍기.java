public class Ex05_별찍기 {

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            //안쪽의 반복은 열을 결정한다.
            // -> i가 0일때 1회를 수행하기 위해서 j < 1
            // -> i가 1일때 2회를 수행하기 위해서 j < 2
            // -> i가 2일때 3회를 수행하기 위해서 j < 3
            // -> i가 3일때 4회를 수행하기 위해서 j < 4
            // -> i가 n일때 i+1회를 수행하기 위해서 j < i+1

            
            

            
            for (int j =0; j < i+1;  j++) {
                System.out.print("*");

            }
            System.out.println(); // 줄바꿈
        }
    }
}