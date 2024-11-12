abstract class ElevatorState {
    abstract String floorName();
    abstract int floorNumber();
    
    void handleFloorRequest(Elevator elevator, int targetFloor){
        if (targetFloor == floorNumber()){
            System.out.println("Already on "+this.floorName()+" floor");
            return;
        }
        elevator.closeDoor();
        ElevatorState newFloor = ElevatorStateFactory.createState(targetFloor);
        System.out.println("Moving to "+newFloor.floorName()+" floor");
        elevator.setState(newFloor);
        elevator.openDoor();
    }
}