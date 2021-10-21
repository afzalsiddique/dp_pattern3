public class TestATMMachine {

    public static void main(String[] args){

        ATMMachine realATMMachine = new ATMMachine();
        ATMProxy atmProxy = new ATMProxy(realATMMachine);

        System.out.println("Cash in ATM Machine from proxy $" + atmProxy.getCashInMachine());
        atmProxy.insertCard();
        atmProxy.insertPin(1234);
        atmProxy.requestCash(1500);
        atmProxy.ejectCard();

        System.out.println("Cash in ATM Machine from proxy $" + atmProxy.getCashInMachine());

        // not possible
        // atmProxy.setCashInMachine(10000);

        System.out.println("\nSetting cash in the real machine by the bank");
        realATMMachine.setCashInMachine(10000);
        System.out.println("Cash in ATM Machine from real machine $" + realATMMachine.getCashInMachine());
        System.out.println("Cash in ATM Machine from proxy $" + atmProxy.getCashInMachine());
    }

}
