package dev.jong;

public class GoCart extends AbstractCar implements CarInterface {
    private Driver driver;

    @Override
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void accelerate() {
        this.velocity +=5;
    }

    @Override
    public void brake() {
        this.velocity -= 5;
        super.brake(); //AbstractCar에 들어있는 brake함수에 도달하기 위해 사용함
    }
}
