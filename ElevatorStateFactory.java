class ElevatorStateFactory {
    public static ElevatorState createState(int floor) {
        switch (floor) {
            case 0: return new GroundFloorState();
            case 1: return new FirstFloorState();
            //case 2: return new SecondFloorState();
            default:
                throw new IllegalArgumentException("Invalid floor: " + floor);
        }
    }
}