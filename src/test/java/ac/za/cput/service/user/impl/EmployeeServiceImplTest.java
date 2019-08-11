package ac.za.cput.service.user.impl;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.factory.user.EmployeeFactory;
import ac.za.cput.repository.user.EmployeeRepository;
import ac.za.cput.repository.user.impl.EmployeeRepositoryImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeServiceImplTest {

    private EmployeeRepositoryImpl repository;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        this.repository= EmployeeRepositoryImpl.getInstance();
        this.employee = EmployeeFactory.getEmployee("Asanda","1111","Gaju");

    }
    @Test
    public void getAll() {
        Set<Employee> employees = this.repository.getAll();
    }

    @Test
    public void create() {
        Employee create = this.repository.create(this.employee);
        Assert.assertNotNull(create.getEmpNum());
    }

    @Test
    public void update() {
        Employee update = new Employee.Builder().empNum("55555").build();
        Assert.assertSame("55555",update.getEmpNum());
    }

    @Test
    public void delete() {
        this.repository.delete(employee.getEmpNum());
        getAll();
    }

    @Test
    public void read() {
        Employee read = this.repository.read(employee.getEmpNum());
        Assert.assertNull(read);
    }
}