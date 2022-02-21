package edu.pkch.memento;

import java.util.ArrayList;
import java.util.Stack;

/**
 * CareTaker of Memento Pattern
 */
public class UpdateHistories {

    private final Stack<Update> histories;

    UpdateHistories(int initVersion) {
        this.histories = new Stack<>();
        histories.add(new Update(initVersion));
    }

    void addUpdateVersionHistory(int version) {
        histories.add(new Update(version));
    }

    void restorePreviousUpdateVersion(CurrentUpdate currentUpdate) {
        Update prevUpdate = histories.pop();
        currentUpdate.undoUpdate(prevUpdate);
    }
}
