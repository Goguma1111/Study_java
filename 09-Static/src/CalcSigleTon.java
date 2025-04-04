public class CalcSigleTon {
    private static CalcSigleTon current;

    public static CalcSigleTon getInstance(){
        if (current == null) {
            current = new CalcSigleTon();
        }
        return current;
    }




    private CalcSigleTon() {
        System.out.println("CalcSingleTon에 대한 current 객체가 생성됨");
    }


    /*** 이하 이 클래스의 객체가 포함해야 될 메서드 ***/

    public int plus(int x, int y) {return x + y;}
    public int minus(int x, int y) {return x - y;}
    public int tims(int x, int y) {return x * y;}
    public int divied(int x, int y) {return x / y;}

}
