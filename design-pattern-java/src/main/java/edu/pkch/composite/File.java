package edu.pkch.composite;

public class File extends Resource {
    public File(String title) {
        super(title);
    }

    @Override
    public void printTitle() {
        System.out.println(this.title);
    }

    @Override
    public void addResource(Resource resource) {
        throw new UnsupportedOperationException();
    }
}
