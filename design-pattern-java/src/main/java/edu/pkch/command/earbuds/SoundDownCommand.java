package edu.pkch.command.earbuds;

public class SoundDownCommand implements Command {
    private final SoundControlManager soundControlManager;

    public SoundDownCommand(SoundControlManager soundControlManager) {
        this.soundControlManager = soundControlManager;
    }

    @Override
    public void execute() {
        soundControlManager.soundDown();
    }
}
