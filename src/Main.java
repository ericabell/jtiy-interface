public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean isDeviceOn;
        int newChannel;

        int phonePickup;
        double phoneHangUp;
        String phoneNumber;

        TelephoneAndTelevisionDevice myDevice = new TelephoneAndTelevisionDevice();

        isDeviceOn = myDevice.turnOn();
        System.out.printf("The Television device is on? %s\n" , java.lang.Boolean.toString(isDeviceOn));

        newChannel = myDevice.changeToChannel(22);
        System.out.printf("Turned to channel: %d\n" , newChannel);
        newChannel = myDevice.changeToChannel(44);
        System.out.printf("Turned to channel: %d\n" , newChannel);

        isDeviceOn = myDevice.turnOff();
        System.out.printf("The Television device is on? %s\n" , java.lang.Boolean.toString(isDeviceOn));


        phonePickup = myDevice.pickupPhone();
        System.out.printf("Did I pickup the phone? %d\n" , phonePickup);

        phoneNumber = myDevice.dialNumber("555-555-5555");
        System.out.printf("What number did I dial? %s\n" , phoneNumber);

        phoneHangUp = myDevice.hangUp();
        System.out.printf("Did I hang up the phone? %f\n" , phoneHangUp);

        System.out.printf("What is this device? %s\n" , myDevice.whatIsThisDevice());


        ImplementsExtendTelephone newExtendedTelephone = new ImplementsExtendTelephone();
        System.out.printf("What did the ExtendedTelephone say? %d\n" , newExtendedTelephone.boo());


    }
}
