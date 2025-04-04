public class SmartHomeTest {
    public static void main(String[] args) {
        SmartDevice[] devices = new SmartDevice[3];
        devices[0] = new SmartLight("스마트 전등");
        devices[1] = new SmartSpeaker("스마트 스피커");
        devices[2] = new SmartThermostat("스마트 온도조절기");
        // 모든 기기 전원 켜기

        for (int i = 0; i < devices.length; i++) {
        devices[i].turnOn();
        }

        // 상태 출력

        for (int i = 0; i < devices.length; i++) {
        devices[i].showStatus();
        }
        System.out.println();

        // 각 기기의 고유 기능 실행 (다운캐스팅 사용)
        SmartLight light = (SmartLight) devices[0];
        light.changeColor("파란색");
        SmartSpeaker speaker = (SmartSpeaker) devices[1];
        speaker.playMusic("Jazz");
   
        SmartThermostat thermostat = (SmartThermostat) devices[2];
        thermostat.setTemperature(24);
            }
          }
