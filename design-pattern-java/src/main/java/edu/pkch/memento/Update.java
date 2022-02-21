package edu.pkch.memento;

/**
 * Memento
 */
public class Update {

    private int version;

    Update(int version) {
        this.version = version;
    }

    public int getVersion() {
        return version;
    }
}
