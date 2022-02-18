package edu.pkch.chain.validator;

import edu.pkch.chain.Input;
import edu.pkch.chain.ValidatorChain;

public class LastNameValidator extends ValidatorChain {
    @Override
    public void validate(Input input) {
        if (!input.getName().startsWith("박")) {
            System.out.println("성이 박이 아니라면 가입할 수 없습니다.");
        }

        next.validate(input);
    }
}
