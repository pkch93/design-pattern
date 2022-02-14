package edu.pkch.visitor;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Dot(), new Circle(), new Rectangle(), new Graph());
        shapes.forEach(shape -> shape.position(new XmlGeographicPresenter()));
    }
}
