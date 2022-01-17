package edu.pkch.factory;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private final List<Employee> employees = new ArrayList<>();

    public void joining(Employee employee) {
        employees.add(employee);
    }
}
