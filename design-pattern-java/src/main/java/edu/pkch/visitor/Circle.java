package edu.pkch.visitor;

public class Circle implements Shape {
    @Override
    public void position(GeographicPresenter geographicPresenter) {
        geographicPresenter.present(this);
    }
}
