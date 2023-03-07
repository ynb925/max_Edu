package test.com.interfaces;

public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("the car is on the way");
    }
}
