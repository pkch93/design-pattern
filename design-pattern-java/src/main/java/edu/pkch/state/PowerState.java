package edu.pkch.state;

public enum PowerState implements State {
    ON("노트북을 끕니다."),
    OFF("노트북을 켭니다.");

    private final String message;

    PowerState(String message) {
        this.message = message;
    }

    @Override
    public void power() {
        System.out.println(message);
    }
}
