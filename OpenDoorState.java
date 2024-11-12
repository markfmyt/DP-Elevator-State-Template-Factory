class OpenDoorState implements DoorState {
    @Override
    public void open(Door door) {
        System.out.println("Keeping door open");
    }

    @Override
    public void close(Door door) {
        System.out.println("Closing door");
        door.setState(new ClosedDoorState());
    }

    @Override
    public boolean isOpen() {
        return true;
    }
}
