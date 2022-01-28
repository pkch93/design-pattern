package edu.pkch.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Resource {
    private final List<Resource> resources;

    private Folder(String title, List<Resource> resources) {
        super(title);
        this.resources = resources;
    }

    public static Folder createInitFolder(String title) {
        return new Folder(title, new ArrayList<>());
    }

    @Override
    public void printTitle() {
        System.out.println(this.title);
        resources.forEach(Resource::printTitle);
    }

    @Override
    public void addResource(Resource resource) {
        resources.add(resource);
    }
}
