import java.util.ArrayList;
import java.util.List;

public class Ex03_list {
    public static void main(String[] args) {

        
        List<Integer> numberList = new ArrayList<Integer>();


        // 데이터 추가하기
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);
        numberList.add(60);
        numberList.add(70);
        numberList.add(80);
        numberList.add(90);

        /** 추가된 데이터 활용 */
        // 추가된 데이터의 수량
        int count = numberList.size();
        System.out.println("데이터의 크기"+ count);

        int value = numberList.get(4);
        System.out.println("4번째 요소의 값" + value);

        numberList.remove(4);

        count = numberList.size();
        System.out.println("데이터의 크기" + count);

        value = numberList.get(4);
        System.out.println("4번째 요소의 값: " + value);

        numberList.add(4,123);
        value = numberList.get(4);
        System.out.println("4번째 요소의 값" + value);

        count = numberList.size();
        System.out.println("데이터의 크기:" + count);

        for(int i = 0; i<numberList.size(); i++){

            Integer number = numberList.get(i);
            System.out.printf("%d의 데이터 >> %d\n", i, number);


        }

        numberList.clear();
        count = numberList.size();
        System.out.println("데이터의 크기" + count);
    }
}
