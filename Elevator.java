class Elevator {
    private ElevatorState currentState;
    private Door door;

    public Elevator() {
        this.currentState = new GroundFloorState();
        this.door = new Door();
    }

    public int getFloor() {
        return currentState.floorNumber();
    }

    public void setState(ElevatorState state) {
        this.currentState = state;
    }

    public Door getDoor() {
        return door;
    }

    public void openDoor() {
        door.open();
    }

    public void closeDoor() {
        door.close();
    }

    public void firstFloor() {
        currentState.handleFloorRequest(this,1);
    }

    public void groundFloor() {
        currentState.handleFloorRequest(this,0);
    }

    //public void secondFloor() {currentState.handleFloorRequest(this,2);}
}