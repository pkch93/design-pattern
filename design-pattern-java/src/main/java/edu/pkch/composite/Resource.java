package edu.pkch.composite;

public abstract class Resource {
    protected final String title;

    public Resource(String title) {
        this.title = title;
    }

    abstract public void printTitle();

    abstract public void addResource(Resource resource);
}
