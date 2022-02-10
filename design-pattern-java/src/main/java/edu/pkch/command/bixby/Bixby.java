package edu.pkch.command.bixby;

import java.util.Map;

/**
 * Command를 호출하는 invoker 역할의 클래스
 */
public class Bixby {
    private final Map<String, Command> commands;

    public Bixby(Map<String, Command> commands) {
        this.commands = commands;
    }

    public void execute(String commandKey) {
        if (commands.containsKey(commandKey)) {
            commands.get(commandKey).execute();
            return;
        }

        System.out.println("무슨 말씀인지 모르겠어요.");
    }
}
