package treemapimplementation;

import java.util.*;

public class TreeMap1 {
    static class Employee {
        private int id;
        private String name;
        private double salary;

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {
        Comparator<Integer> keyComparator = Comparator.naturalOrder();
        TreeMap<Integer, Employee> tm = new TreeMap<>(keyComparator);

        tm.put(101, new Employee(101, "Rash", 1000));
        tm.put(103, new Employee(103, "Hash", 1200));
        tm.put(102, new Employee(102, "Aish", 1500));

        for (Map.Entry<Integer, Employee> entry : tm.entrySet()) {
            Employee emp = entry.getValue();
            System.out.println(emp.getId() + ": " + emp.getName() + ", " + emp.getSalary());
        }
    }
}
