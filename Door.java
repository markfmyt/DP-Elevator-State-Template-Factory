class Door {
    private DoorState state;

    public Door() {
        this.state = new OpenDoorState();
    }

    public void open() {
        state.open(this);
    }

    public void close() {
        state.close(this);
    }

    public boolean isOpen() {
        return state.isOpen();
    }

    void setState(DoorState state) {
        this.state = state;
    }
}
