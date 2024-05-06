package hashimplementation;

import java.util.*;

public class HashMapRunner {
    public static class Employee {
        private int id;
        private String name;
        private String designation;
        private String department;

        public Employee(int id, String name, String designation, String department) {
            this.id = id;
            this.name = name;
            this.designation = designation;
            this.department = department;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDesignation() {
            return designation;
        }

        public String getDepartment() {
            return department;
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, Employee> employees = new HashMap<>();
        employees.put(101, new Employee(101, "Rash", "SE", "IT"));
        employees.put(103, new Employee(103, "Hash", "ASE", "IT"));
        employees.put(102, new Employee(102, "Aish", "TSE", "IT"));

        Map<Integer, Employee> sortedEmployees = new HashMap<>(employees);

        for (Map.Entry<Integer, Employee> entry : sortedEmployees.entrySet()) {
            Employee emp = entry.getValue();
            System.out.println(emp.getId() + ": " + emp.getName() + ", " + emp.getDesignation() + ", " + emp.getDepartment());
        }
    }
}
