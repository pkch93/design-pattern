package edu.pkch.command.earbuds;

public class NoiseControlCommand implements Command {
    private final NoiseControlManager noiseControlManager;

    public NoiseControlCommand(NoiseControlManager noiseControlManager) {
        this.noiseControlManager = noiseControlManager;
    }

    @Override
    public void execute() {
        noiseControlManager.change();
    }
}
