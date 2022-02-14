package edu.pkch.visitor;

public class XmlGeographicPresenter implements GeographicPresenter {

    @Override
    public void present(Shape shape) {
        if (shape instanceof Dot) {
            System.out.println("<type>Dot</type>");
        } else if (shape instanceof Circle) {
            System.out.println("<type>Circle</type>");
        } else if (shape instanceof Rectangle) {
            System.out.println("<type>Rectangle</type>");
        } else if (shape instanceof Graph) {
            System.out.println("<type>Graph</type>");
        }
    }
}
