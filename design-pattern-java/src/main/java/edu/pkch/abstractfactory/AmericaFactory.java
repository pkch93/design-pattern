package edu.pkch.abstractfactory;

public class AmericaFactory implements Factory {

    @Override
    public Tire createTire() {
        return new AmericaTire();
    }

    @Override
    public Door createDoor() {
        return new AmericaDoor();
    }
}
