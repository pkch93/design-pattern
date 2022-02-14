package edu.pkch.visitor;

public class Graph implements Shape {
    @Override
    public void position(GeographicPresenter geographicPresenter) {
        geographicPresenter.present(this);
    }
}
