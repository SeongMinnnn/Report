public class ReportApplication {
    public static void main(String[] args){

        Bus bus1 = new Bus();
        bus1.price = 750;
        bus1.fuelGageCurrent = 50;
        bus1.status = "운행";
        Bus bus2 = new Bus();
        bus2.price = 300;
        bus2.passengerCurrent = 2;
        bus2.fuelGageCurrent = 5;


        bus1.passengerAdd(2);
        bus1.busDrive("운행");
        bus1.fuelCharge(10);

        System.out.println();

        bus2.passengerAdd(40);
        bus2.passengerAdd(5);
        bus2.busDrive("차고지행");
    }
}