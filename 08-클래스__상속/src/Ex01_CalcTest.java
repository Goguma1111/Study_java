public class Ex01_CalcTest {
    public static void main(String[] args) {
        // 부모클래스에 대한 객체는 자신에게 정의된 기능만을 사용할 수 있다.
        CalcParent parent = new CalcParent();
        System.out.println(parent.plus(100,50));
        System.out.println(parent.minus(100, 50));

        System.out.println("--------");


        // 자식 클래스에 대한 객체는 부모에게 물려받은 기능과
        // 자신이 새롭게 정의한 기능을 모두 사용할 수 있다.
        CalcChild child = new CalcChild();
        System.out.println(child.plus(200, 100));
        System.out.println(child.minus(200, 100));
        System.out.println(child.times(200, 100));
        System.out.println(child.divide(200, 100));

    }
}
