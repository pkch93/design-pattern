package edu.pkch.factory;

public class EmployeeFactory {
    private static class LazyHolder {
        public static final EmployeeFactory INSTANCE = new EmployeeFactory();
    }

    public static EmployeeFactory getFactory() {
        return LazyHolder.INSTANCE;
    }

    public Employee createEmployee(String name, int age, int career, Employee.Position position, Employee.Gender gender) {
        return new Employee(name, age, career, position, gender);
    }
}
