package edu.pkch.factory;

import java.util.ArrayList;
import java.util.List;

public class HeadHunter {
    private final List<Employee> clients = new ArrayList<>();

    public void addClient(Employee employee) {
        clients.add(employee);
    }
}
