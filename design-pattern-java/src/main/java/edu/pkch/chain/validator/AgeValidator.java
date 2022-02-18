package edu.pkch.chain.validator;

import edu.pkch.chain.Input;
import edu.pkch.chain.ValidatorChain;

public class AgeValidator extends ValidatorChain {

    @Override
    public void validate(Input input) {
        if (input.getAge() >= 30) {
            System.out.println("30살 이상은 가입할 수 없습니다.");
            return;
        }

        next.validate(input);
    }
}
