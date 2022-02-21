package edu.pkch.memento;

/**
 * Originator of Memento Pattern
 */
public class CurrentUpdate {

    private int version;

    private CurrentUpdate(int version) {
        this.version = version;
    }

    public static CurrentUpdate of(int version) {
        return new CurrentUpdate(version);
    }

    int updateVersionUp() {
        version += 1;
        return version;
    }

    void undoUpdate(Update update) {
        this.version = update.getVersion();
    }
}
