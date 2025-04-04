public class Ex03_논리값_원소_반전 {
    public static void main(String[] args) {
        boolean [] checked = {true,false,true,false,false};


        for (int i =0; i< checked.length; i++) {
            // i번째 원소를 부정하여 다시 그자리에 덮어 씌움
            // boolean값은 부정하면 반대의 값이 된다.
            // !true = false
            // !false = true
            checked[i] = !checked[i];
        }


        // 배열의 전체 원소 출력
        for (int i = 0; i<checked.length; i++) {
            System.out.print(checked[i] + "\t");
        }
    }
}
