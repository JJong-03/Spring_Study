package dev.jong;

public class SmallCar extends AbstractCar implements CarInterface{
    private  Driver driver;
//    private  int velocity; 얘는 왜 지우는가?.
    @Override
    public void setDriver(Driver driver) {
        if(driver.getLicense() < 1){ //무면허 경우
            throw new RuntimeException("insufficient license");
        }
    }

    @Override
    public void accelerate() {
        this.velocity += 10;
    }

    @Override
    public void brake() {
        this.velocity -= 10;
        super.brake();
    }
}
