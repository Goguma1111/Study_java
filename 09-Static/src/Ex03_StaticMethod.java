class StaticCounter2{
    // 정적 멤버변수

    static int count = 0;
    boolean created = false;


    public StaticCounter2() {
        count++;
        created = true;
    }



    public int getNormal() {


        created = true;
        return count;
    }

    public static int getStatic() {



        //create = ture;
        return count;
    }

    }       
public class Ex03_StaticMethod {
    public static void main(String[] args) {
        
    
    //  static 변수에 대한 직접 접근

    System.out.printf("전체 객체의 수: %d\n", StaticCounter2.count);
    System.out.println("----------");


    // 객체생성
    // --> c1이 접근하는  counter 값과 c가 접근하는 count값은 
    //                 서로 공유하는 데이터


    StaticCounter2 c1 = new StaticCounter2();
    StaticCounter2 c2 = new StaticCounter2();


    System.out.printf("c1의 getNormal() 리턴값: %d\n", c1.getNormal());
    System.out.printf("c2의 getNormal() 리턴값: %d\n", c2.getNormal());
    System.out.println("----------");


    System.out.printf("c1의 getStatic() 리턴값: %d\n", StaticCounter2.getStatic());
    System.out.printf("c2의 getStatic() 리턴값: %d\n", StaticCounter2.getStatic());
    System.out.println("------------");

    System.out.printf("전체 객체의 수: %d\n", StaticCounter2.count);
    }
}
