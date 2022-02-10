package edu.pkch.command.earbuds;

public class BixbyCommand implements Command {
    private final Bixby bixby;

    public BixbyCommand(Bixby bixby) {
        this.bixby = bixby;
    }

    @Override
    public void execute() {
        bixby.welcome();
    }
}
