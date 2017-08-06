public interface Telephone {
    String number;
    boolean callActive;

    int volume;

    int pickupPhone();
    int placeCall();
    int hangUp();

}
