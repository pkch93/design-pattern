package edu.pkch.visitor;

public class Rectangle implements Shape {
    @Override
    public void position(GeographicPresenter geographicPresenter) {
        geographicPresenter.present(this);
    }
}
