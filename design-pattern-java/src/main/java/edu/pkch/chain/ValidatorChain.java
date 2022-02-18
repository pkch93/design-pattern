package edu.pkch.chain;

public abstract class ValidatorChain {
    protected ValidatorChain next;

    public void setNext(ValidatorChain validatorChain) {
        this.next = validatorChain;
    }

    public abstract void validate(Input input);
}
