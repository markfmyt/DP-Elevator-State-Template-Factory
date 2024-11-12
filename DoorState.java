interface DoorState {
    void open(Door door);
    void close(Door door);
    boolean isOpen();
}