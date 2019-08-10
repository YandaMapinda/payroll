package ac.za.cput.factory.user;

import ac.za.cput.domain.user.Employee;

public class EmployeeFactory {
    public static Employee getEmployee(String name,String empNum,String surname){
        return new Employee.Builder().empNum(empNum).name(name).surname(surname).build();
    }
}
