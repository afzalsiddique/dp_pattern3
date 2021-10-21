public class TestATMMachine {

    public static void main(String[] args){

        ATMMachine realATMMachine = new ATMMachine();
        GetATMData atmProxy = new ATMProxy(realATMMachine);

        System.out.println("Cash in ATM Machine from proxy $" + atmProxy.getCashInMachine());
        realATMMachine.insertCard();
        realATMMachine.insertPin(1234);
        realATMMachine.requestCash(200);


        System.out.println("Current ATM State " + atmProxy.getATMState());

        System.out.println("Cash in ATM Machine from proxy $" + atmProxy.getCashInMachine());

        // not possible
        // atmProxy.setCashInMachine(10000);

        System.out.println("\nSetting cash in the real machine");
        realATMMachine.setCashInMachine(10000);
        System.out.println("Cash in ATM Machine from real machine $" + realATMMachine.getCashInMachine());
        System.out.println("Cash in ATM Machine from proxy $" + atmProxy.getCashInMachine());
    }

}
