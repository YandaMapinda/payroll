package ac.za.cput.factory.user;

import ac.za.cput.domain.user.Employee;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeFactoryTest {

    private String name,surname,empnum;

    @Before
    public void setUp() throws Exception {
        this.name = "Thandi";
        this.surname = "Jicks";
        this.empnum = "768976";
    }


    @Test
    public void getEmployee() {
        Employee employee = EmployeeFactory.getEmployee(this.name,this.empnum,this.surname);
        Assert.assertNotNull(employee.getEmpNum(),employee.getName());
        Assert.assertNotNull(employee);
    }
}
