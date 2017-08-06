public interface Television {

    boolean turnOn();
    int changeToChannel(int newChannel);
    boolean turnOff();

    default int watchNetflix() {
        // returns the channel for Netflix....
        return(99);
    }

    static int convertChannel(int channel) {
        return channel + 100;
    }

    abstract String whatIsThisDevice();

}
