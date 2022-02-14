package edu.pkch.visitor;

public class Dot implements Shape {
    @Override
    public void position(GeographicPresenter geographicPresenter) {
        geographicPresenter.present(this);
    }
}
