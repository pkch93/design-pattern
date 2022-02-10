package edu.pkch.command.bixby;

public class SongRecommendationCommand implements Command {
    public static final String COMMAND_KEY = "노래추천해줘";

    private final SongPicker songPicker;

    public SongRecommendationCommand(SongPicker songPicker) {
        this.songPicker = songPicker;
    }

    @Override
    public void execute() {
        songPicker.pick();
    }
}
