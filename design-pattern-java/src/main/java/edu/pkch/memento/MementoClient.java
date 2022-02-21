package edu.pkch.memento;

public class MementoClient {
    public static void main(String[] args) {
        int initVersion = 1;
        Updater updater = new Updater(CurrentUpdate.of(initVersion), new UpdateHistories(initVersion));

        updater.update();
        updater.restore();
    }
}
