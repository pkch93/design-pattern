package edu.pkch.memento;

public class Updater {
    private final CurrentUpdate currentUpdate;
    private final UpdateHistories updateHistories;

    public Updater(CurrentUpdate currentUpdate,
                   UpdateHistories updateHistories) {
        this.currentUpdate = currentUpdate;
        this.updateHistories = updateHistories;
    }

    public void update() {
        int nextVersion = currentUpdate.updateVersionUp();
        updateHistories.addUpdateVersionHistory(nextVersion);
    }

    public void restore() {
        updateHistories.restorePreviousUpdateVersion(currentUpdate);
    }
}
