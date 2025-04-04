public class SmartDevice {
    private String name;
    private int isOn;


    public SmartDevice(String name, int isOn) {
        this.name = name;
        this.isOn = isOn;
    }


    public String getName() {
        return this.name;
    }

    
    
    public void setName(String name) {
        this.name = name;
    }

    
    
    public int getIsOn() {
        return this.isOn;
    }



    public void setIsOn(int isOn) {
        this.isOn = isOn;
    }



    public void turnOn() {
        System.out.println("기기명이 켜졌습니다.");
    }




    public void turnOff() {
        System.out.println("기기명이 꺼졌습니다.");
    }



    public void showStatus() {
       String status = this.isOn ? "ON" : "Off";
    }
}


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", isOn='" + getIsOn() + "'" +
            "}";
    }
    
class SmartLight extends SmartDevice {
    public void changeColor(String color) {
        System.out.println("스마트 전등 조명이 파란색으로 바뀝니다.");
        System.out.println("기기명이 꺼져 있어 색상을 변경할 수 없습니다.");
    }
}



class SmartSpeaker extends SmartDevice {
    public void playMusic(String song) {
        System.out.println("스마트 스피커에서 %d 음악을 재생합니다.");
        System.out.println("기기명이 꺼져 있어 음악을 틀 수 없습니다.");
    }
}




class SmartThermostat extends SmartDevice {
    public void setTemperature(int degree) {
        System.out.println("스마트 온도 조절기의 온도를 %d도로 설정합니다");
        System.out.println("기기명이 꺼져 있어 온도를 설정할 수 없습니다.");
    }
}

