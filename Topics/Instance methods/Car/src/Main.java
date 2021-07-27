class Car {

    int yearModel;
    String make;
    int speed;

    public void accelerate() {
        speed = speed + 5;
    }

    public void brake() {
        if (speed >= 5) {
            speed = speed - 5;
    } else {
        speed = 0;
        }
    }
}