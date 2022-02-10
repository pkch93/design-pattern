package edu.pkch.command.earbuds;

public class SoundUpCommand implements Command {
    private final SoundControlManager soundControlManager;

    public SoundUpCommand(SoundControlManager soundControlManager) {
        this.soundControlManager = soundControlManager;
    }

    @Override
    public void execute() {
        soundControlManager.soundUp();
    }
}
