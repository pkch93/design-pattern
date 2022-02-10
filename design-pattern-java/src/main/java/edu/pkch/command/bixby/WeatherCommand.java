package edu.pkch.command.bixby;

public class WeatherCommand implements Command {
    public static final String COMMAND_KEY = "오늘 날씨 알려줘";
    private final WeatherCast weatherCast;

    public WeatherCommand(WeatherCast weatherCast) {
        this.weatherCast = weatherCast;
    }

    @Override
    public void execute() {
        weatherCast.weatherInfo();
    }
}
