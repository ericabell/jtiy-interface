public interface ExtendsTelephone extends Telephone {

    abstract int boo();

    @Override
    default int pickupPhone() {
        return 0;
    }

    @Override
    default String dialNumber(String number) {
        return null;
    }

    @Override
    default double hangUp() {
        return 0;
    }

    @Override
    default String whatIsThisDevice() {
        return null;
    }
}
