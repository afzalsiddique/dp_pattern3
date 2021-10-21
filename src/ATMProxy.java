public class ATMProxy implements GetATMData {

    // Allows the user to access getATMState in the
    // Object ATMMachine
    ATMMachine realATMMachine;
    public ATMProxy(ATMMachine realATMMachine){
        this.realATMMachine = realATMMachine;
    }
    public ATMState getATMState() {
        return realATMMachine.getATMState();
    }

    // Allows the user to access getCashInMachine
    // in the Object ATMMachine

    public int getCashInMachine() {
        return realATMMachine.getCashInMachine();

    }

}
