package edu.pkch.command.earbuds;

public class Client {

    public static void main(String[] args) {
        Earbud earbud = Earbud.init();
        earbud.clickLeftPad();
        earbud.clickRightPad();

        earbud.changeToBixbyCommand();
        earbud.clickLeftPad();
        earbud.clickRightPad();

        earbud.changeToSoundCommand();
        earbud.clickLeftPad();
        earbud.clickRightPad();

        earbud.changeToNoiseControlCommand();
        earbud.clickLeftPad();
        earbud.clickRightPad();

        earbud.makeFindEarbudSound();
    }
}
