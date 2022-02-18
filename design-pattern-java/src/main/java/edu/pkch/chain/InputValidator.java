package edu.pkch.chain;

import edu.pkch.chain.message.AgeValidateMessage;
import edu.pkch.chain.message.LastNameValidateMessage;
import edu.pkch.chain.message.MarriedValidateMessage;
import edu.pkch.chain.validator.AgeValidator;
import edu.pkch.chain.validator.LastNameValidator;
import edu.pkch.chain.validator.MarriedValidator;

public class InputValidator {
    public void validate(Input input) {
        if (input.getAge() >= 30) {
            System.out.println("30살 이상은 가입할 수 없습니다.");
        } else if (!input.getName().startsWith("박")) {
            System.out.println("성이 박이 아니라면 가입할 수 없습니다.");
        } else if (input.isMarried()) {
            System.out.println("기혼자는 가입할 수 없습니다");
        }
    }

    public void validateWithMessage(Input input) {
        if (input.getAge() >= 30) {
            new AgeValidateMessage().print();
        } else if (!input.getName().startsWith("박")) {
            new LastNameValidateMessage().print();
        } else if (input.isMarried()) {
            new MarriedValidateMessage().print();
        }
    }

    public void validateForChain(Input input) {
        AgeValidator firstValidator = new AgeValidator();
        LastNameValidator secondValidator = new LastNameValidator();
        MarriedValidator lastValidator = new MarriedValidator();
        firstValidator.setNext(secondValidator);
        secondValidator.setNext(lastValidator);

        firstValidator.validate(input);
    }
}
