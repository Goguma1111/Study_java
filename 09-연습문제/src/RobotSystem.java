abstract class Robot {
    private String name;
    private int batteryLevel;



    public Robot(String name, int batteryLevel) {
        this.name = name;
        this.batteryLevel = batteryLevel;
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void showStatus() {
        System.out.println("로봇명: " + this.getName() + "배터리: " + this.getBatteryLevel() +"%");
    }

    public abstract void oprerate();

}

interface Flyable {

    void fly();
}

interface Searchable {
     void search();
} 



interface Rescuable {
     void rescue();
    
}


class DroneBot extends Robot implements Flyable, Searchable{

    public DroneBot(String name, int batteryLevel) {
        super(name, batteryLevel);
    }

    @Override
    public void oprerate() {
        System.out.println("드론봇이 궁중에서 임무를 시작합니다.");
    }

    @Override
    public void search() {
        System.out.println("드론이 수색 작업을 수행합니다");
    }

    @Override
    public void fly() {
        System.out.println("드론이 비행합니다.");
    }

    
    
}


class RescueBot extends Robot implements Rescuable {

    public RescueBot(String name, int batteryLevel) {
        super(name, batteryLevel);
   
    }
    @Override
    public void oprerate() {
        System.out.println("구조봇이 현장에 투입됩니다.");
    }

    @Override
    public void rescue() {
        System.out.println("구조 임무를 수행합니다.");
    }
    
}


class HybridBot extends Robot implements Flyable, Searchable, Rescuable {

    public HybridBot(String name, int batteryLevel) {
        super(name, batteryLevel);
    }

    @Override
    public void oprerate() {
        System.out.println("하이브리드봇이 다기능 모드로 작동합니다.");
    }

    @Override
    public void rescue() {
        System.out.println("구조 임무를 수행합니다.");
    }

    @Override
    public void search() {
        System.out.println("드론이 수색작업을 수행합니다.");
    }

    @Override
    public void fly() {
        System.out.println("드론이 비행합니다.");
    }



}


public class RobotSystem {
    public static void main(String[] args) {
        Robot[] r = new Robot[3];
        
        r[0] = new DroneBot("드론-01", 80);
        r[1] = new RescueBot("구조-09", 65);
        r[2] = new HybridBot("하이브리드-x", 95);


        for(int i = 0; i < r.length; i++){
            r[i].showStatus();
            r[i].oprerate();


            // 특정 인터페이스로부터 상속받은 기능을 활성화하기 위해서는
            // 인터페이스 타입으로 임시 Downcasting을 해야 한다.
            if (r[i] instanceof Flyable){
                ((Flyable) r[i]).fly();
            }

            if (r[i] instanceof Searchable){
                ((Searchable) r[i]).search();
            }

            if (r[i] instanceof Rescuable){
                ((Rescuable) r[i]).rescue();;
            }

            System.out.println();

        }
    }
}
