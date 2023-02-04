public class Bus {
    static int busNumCheck = 0;
    static int maxPassenger = 30;
    int passengerMax = 30;
    int passengerCurrent = 0;
    int price = 1000;
    String status = "운행";
    int fuelGageCurrent = 100;
    int speed;
    int busNum;

    public Bus() {
        busNum = busNumCheck++;
        speed = 0;
        System.out.println(busNum+1 + "번 버스객체 만들어짐!");
    }

    void busDrive(String status) {
        if (status.equals("운행")) status = "차고지행";
        else status = "운행";
        if (fuelGageCurrent < 10) System.out.println("주유가 필요합니다");

        System.out.println("상태: "+status);
    }

    void passengerAdd(int passengerNew) {
        if (!(status.equals("운행"))) {
            System.out.println("운행 중이 아닙니다.");
            return;
        }
        if (passengerCurrent + passengerNew > passengerMax) {
            System.out.println("최대 승객 수를 초과했습니다");
            return;
        }

        passengerCurrent += passengerNew;
        System.out.println("탑승 승객 수 = " + passengerNew);
        System.out.println("잔여 승객 수 = " + (passengerMax - passengerCurrent));
        System.out.println("요금 확인 = " + price * passengerNew);
        System.out.println("주유량: "+fuelGageCurrent);
    }
    void fuelCharge(int fuelGage) {
        if (!(fuelGage < 100)){
            status = "연료 탱크를 초과합니다.";
            return;
        }
        fuelGageCurrent += fuelGage;

        System.out.println("주유량: "+fuelGageCurrent);
    }
}