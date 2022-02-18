package edu.pkch.chain.validator;

import edu.pkch.chain.Input;
import edu.pkch.chain.ValidatorChain;

public class MarriedValidator extends ValidatorChain {
    @Override
    public void validate(Input input) {
        if (input.isMarried()) {
            System.out.println("기혼자는 가입할 수 없습니다");
        }
    }
}
