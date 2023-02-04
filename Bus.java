public class Bus {
    static int busNumCheck = 0;
    static int price = 1000;
    static int maxPassenger = 30;
    static String status;
    int fuelGage;
    int speed;
    int statusNum;
    int busNum;
    public Bus(){
        maxPassenger = 30;
        busNum = busNumCheck++;
        status = "운행";
        fuelGage = 100;
        speed = 0;
    }

    String drive(int num){
        if (num == 0) status = "운행";
        else if (num == 1) status = "차고지행";
        return status;
    }
    String statusChange(int statusNum, int fuelGage){
        status = "운행";
        if (this.fuelGage <= 10) status = "차고지행";
        if (this.statusNum == 1) status = "차고지행";
        return status;
    }
    String passengerChange(int passengerCurrent, int passengerNew){
        if (passengerCurrent + passengerNew <= maxPassenger && status.equals("운행")) passengerCurrent += passengerNew;
        else System.out.println("탑승이 불가합니다");
    }
    String speedChange(int speedChange){
        if(fuelGage >= 10) speed += speedChange;
        else System.out.println("주유량을 확인해주세요");
    }
}
class BusDrive{
    public static void busDrive(){
        Bus bus = new Bus();
        int statusNum = 0;
        System.out.println(bus.drive(statusNum));
    }
}
class BusStatus{
    public static void busStatus(){
        Bus bus = new Bus();
        int statusNum = 0;
        int fuelGage = 20;
        System.out.println(bus.statusChange(statusNum, fuelGage));
    }
}

class BusPassenger{
    public static void busPassenger(){
        Bus bus = new Bus();
        int passengerCurrent = 2;
        int passengerNew = 0;
        System.out.println(bus.passengerChange(passengerCurrent, passengerNew));
    }
}

class BusSpeed {
    public static void busSpeed(){
        Bus bus = new Bus();
        int speedChange = -5;
        System.out.println(bus.speedChange(speedChange));
    }
}