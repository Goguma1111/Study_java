abstract class Transport{
    private String vehicleId;
    private String status;
    

    public Transport(String vehicleId, String status) {
        this.vehicleId = vehicleId;
        this.status = status;
    }



    public String getVehicleId() {
        return this.vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public void stop() {
        System.out.println("교통수단" + this.vehicleId + "정지합니다.");
    }

    
    // public abstract void start();

    public void start() {
        this.setStatus("운행 중");
    }

    public abstract void navigate(String destination);
    
}

class bus extends Transport {

    public bus(String vehicleId, String status) {
        super(vehicleId, status);
    }

    @Override
    public void start() {
      System.out.println("버스" + this.getVehicleId() + "가 출발합니다.");
        
    }

    @Override
    public void navigate(String destination) {
    System.out.println("버스" + destination + "으로 이동합니다.");
    
    }
}    


class train extends Transport{

    public train(String vehicleId, String status) {
        super(vehicleId, status);
    }

    @Override
    public void start() {
        System.out.println("버스" + this.getVehicleId() + "가 출발합니다.");
    }

    @Override
    public void navigate(String destination) {
        System.out.println("기차가" + destination + "으로 이동합니다.");
    }

    
    public void announceStation() {
        System.out.println("기차가 다음 역들을 안내 합니다.");
    }
}


class Drone extends Transport{

    public Drone(String vehicleId, String status) {
        super(vehicleId, status);
 
    }


    @Override
    public void start(){
        System.out.println("드론" + this.getVehicleId() + "가 이륙합니다");
    }
    @Override
    public void navigate(String destination) {
        System.out.println("드론이 항공 경로에 따라" + destination + "으로 진입합니다.");

    }

    public void captureSurroundings() {
        System.out.println("드론이 주변 상황을 촬영합니다.");
    }
}



public class SmartcityTranportSystem {
    public static void main(String[] args) {
        Transport[] v = new Transport[3];
        v[0] = new bus("Bus-001", "대기");
        v[1] = new train("TR-202", "대기");
        v[2] = new Drone("DRN-A7", "대기");

        for(int i =0; i < v.length; i++){
            v[i].start();
            v[i].navigate("서울역");
            v[i].stop();



        


        if(v[i] instanceof train){
            ((train) v[1]).announceStation();

        } else if (v[i] instanceof Drone){
           ((Drone) v[2]).captureSurroundings();
        }

        System.out.println("------------");
    }
    
    }
}