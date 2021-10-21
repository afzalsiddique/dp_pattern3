public class ATMProxy implements GetATMData {

    ATMMachine realATMMachine;
    public ATMProxy(ATMMachine realATMMachine){
        this.realATMMachine = realATMMachine;
    }
    public ATMState getATMState() {
        return realATMMachine.getATMState();
    }


    public int getCashInMachine() {
        return realATMMachine.getCashInMachine();

    }
    public void insertCard() {
        getATMState().insertCard();
    }

    public void ejectCard() {
        getATMState().ejectCard();
    }

    public void requestCash(int cashToWithdraw) {
        getATMState().requestCash(cashToWithdraw);
    }

    public void insertPin(int pinEntered){
        getATMState().insertPin(pinEntered);
    }
}
