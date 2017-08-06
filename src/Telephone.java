public interface Telephone {

    int pickupPhone();
    String dialNumber(String number);
    double hangUp();

    default String callMom() {
        return "111-111-1111";
    }

    static int getVolume() {
        return 22;
    }

    abstract String whatIsThisDevice();
}
