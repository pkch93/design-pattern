package edu.pkch.command.bixby;

import java.util.Map;

public class Client {

    public static void main(String[] args) {
        Bixby bixby = new Bixby(Map.of(
                SongRecommendationCommand.COMMAND_KEY, new SongRecommendationCommand(new SongPicker()),
                WeatherCommand.COMMAND_KEY, new WeatherCommand(new WeatherCast())
        ));

        bixby.execute(SongRecommendationCommand.COMMAND_KEY);
        bixby.execute(WeatherCommand.COMMAND_KEY);
        bixby.execute("맥북 M1 Max 사줘");
    }
}
