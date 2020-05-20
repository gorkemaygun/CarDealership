package CarDealership;

import java.util.*;
import java.time.LocalDateTime;

public abstract class Department {
    private String deptName;
    private int numEmployees;

    public Department() {
        this.deptName = "Generic";
        this.numEmployees = 0;
    }

    public Department(String name, int numEmployees) {
        this.deptName = name;
        this.numEmployees = numEmployees;
    }

    public abstract boolean isOpenToday(LocalDateTime day);

    @Override
    public String toString() {
        return this.deptName + "Department";
    }

    public static void printIsOpen(List<Department> depts, LocalDateTime today) {
        // Cycle through each department in provided List
        for (Department d : depts) {
            // Print out name of Dept and return if that Dept is open today
            System.out.println(d.toString() + " is open today?" + d.isOpenToday(today));
            if (d instanceof ServiceDepartment) {
                System.out.println(d.toString() + " only closes Sunday.");
            }
        }
    }
}