package edu.pkch.state;

public class TurnOn implements State {

    @Override
    public void power() {
        System.out.println("노트북을 끕니다.");
    }
}
