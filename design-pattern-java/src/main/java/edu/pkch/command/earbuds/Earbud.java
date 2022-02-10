package edu.pkch.command.earbuds;

import edu.pkch.command.earbuds.strategy.ChickSoundStrategy;
import edu.pkch.command.earbuds.strategy.FindEarBudSoundStrategy;

/**
 * Invoker of Command Pattern
 */
public class Earbud {
    private Command leftPad;
    private Command rightPad;

    private FindEarBudSoundStrategy strategy;

    private Earbud(Command leftPad, Command rightPad, FindEarBudSoundStrategy strategy) {
        this.leftPad = leftPad;
        this.rightPad = rightPad;
        this.strategy = strategy;
    }

    public static Earbud init() {
        Command noiseControlCommand = new NoiseControlCommand(new NoiseControlManager());
        FindEarBudSoundStrategy strategy = new ChickSoundStrategy();
        return new Earbud(noiseControlCommand, noiseControlCommand, strategy);
    }

    public void clickLeftPad() {
        leftPad.execute();
    }

    public void clickRightPad() {
        rightPad.execute();
    }

    public void makeFindEarbudSound() {
        System.out.println("이어버드 찾기를 실행합니다. 소리에 집중해주세요.");
        strategy.makeSound();
    }

    public void changeToSoundCommand() {
        SoundControlManager soundControlManager = new SoundControlManager();
        SoundUpCommand soundUpCommand = new SoundUpCommand(soundControlManager);
        SoundDownCommand soundDownCommand = new SoundDownCommand(soundControlManager);

        this.leftPad = soundUpCommand;
        this.rightPad = soundDownCommand;
    }

    public void changeToBixbyCommand() {
        BixbyCommand bixbyCommand = new BixbyCommand(new Bixby());
        this.leftPad = bixbyCommand;
        this.rightPad = bixbyCommand;
    }

    public void changeToNoiseControlCommand() {
        NoiseControlCommand noiseControlCommand = new NoiseControlCommand(new NoiseControlManager());
        this.leftPad = noiseControlCommand;
        this.rightPad = noiseControlCommand;
    }
}
