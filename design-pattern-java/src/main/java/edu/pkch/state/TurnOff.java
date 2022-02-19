package edu.pkch.state;

public class TurnOff implements State {

    @Override
    public void power() {
        System.out.println("노트북을 켭니다.");
    }
}
