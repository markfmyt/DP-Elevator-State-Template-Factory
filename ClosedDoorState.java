class ClosedDoorState implements DoorState {
    @Override
    public void open(Door door) {
        System.out.println("Opening door");
        door.setState(new OpenDoorState());
    }

    @Override
    public void close(Door door) {
        System.out.println("Keeping door closed");
    }

    @Override
    public boolean isOpen() {
        return false;
    }
}