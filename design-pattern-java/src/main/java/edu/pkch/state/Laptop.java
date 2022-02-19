package edu.pkch.state;

public class Laptop {
    private State state = new TurnOff();

    public void power() {
       state.power();
    }

    public void changeState(State state) {
        this.state = state;
    }
}
