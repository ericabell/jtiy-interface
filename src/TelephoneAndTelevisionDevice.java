public class TelephoneAndTelevisionDevice implements Telephone, Television {

    int channelNumber;
    String telephoneNumber;

    @Override
    public int pickupPhone() {
        return 1;
    }

    @Override
    public String dialNumber(String number) {
        this.telephoneNumber = number;
        return this.telephoneNumber;
    }

    @Override
    public double hangUp() {
        return 0.0001;
    }

    @Override
    public boolean turnOn() {
        return true;
    }

    @Override
    public int changeToChannel(int newChannel) {
        this.channelNumber = newChannel;
        return this.channelNumber;
    }

    @Override
    public boolean turnOff() {
        return false;
    }
}
