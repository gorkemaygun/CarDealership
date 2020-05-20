package CarDealership;

import java.time.LocalDateTime;
import java.util.*;

public class Dealership {
    public static void main(String[] args) {
        ServiceDepartment sd = new ServiceDepartment();
        FinanceDepartment fd = new FinanceDepartment();
        SalesDepartment sales = new SalesDepartment();
        // Add our departments to a List
        List<Department> depts = new ArrayList<>();
        depts.add(sd);
        depts.add(fd);
        depts.add(sales);

        Department.printIsOpen(depts, LocalDateTime.now());

    }
}