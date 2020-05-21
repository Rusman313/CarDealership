//Interfaces normally follow a naming convention similar to classes
//but they end in "-ible" or "able"
//Usually adjective because we usually use  interfaces to provide additional capabilities

interface Leaseable {
    boolean isLeasable();

    int getLeaseTerm();

    int getMaxMilesPerYear();
    //Default methods can be provided to an interface without affecting implementing classes as it includes an implementation. If each added method in an interface is defined with implementation, then no implementing class is affected. An implementing class can override the default implementation provided by the interface.
    default float getMileablePenalty(){
        return 500.0f;
    }
}