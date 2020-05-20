import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Dealership {
    public static void main(String[] args) {
        // Instantiate new object for each dept
        ServiceDepartment sd = new ServiceDepartment();
        FinanceDepartment fd = new FinanceDepartment();
        SalesDepartment sales = new SalesDepartment();


        // add our departments to a list
        List<Department> depts = new ArrayList<>();
            depts.add(sd);
            depts.add(fd);
            depts.add(sales);
            
            Department.printIsOpen(depts, LocalDateTime.now());
    }
}