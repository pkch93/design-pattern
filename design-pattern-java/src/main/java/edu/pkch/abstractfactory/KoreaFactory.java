package edu.pkch.abstractfactory;

public class KoreaFactory implements Factory {

    @Override
    public Tire createTire() {
        return new KoreaTire();
    }

    @Override
    public Door createDoor() {
        return new KoreaDoor();
    }
}
