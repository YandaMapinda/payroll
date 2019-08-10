package ac.za.cput.service.user.impl;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.repository.user.EmployeeRepository;
import ac.za.cput.repository.user.impl.EmployeeRepositoryImpl;
import ac.za.cput.service.user.EmployeeService;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {

    private static EmployeeServiceImpl service = null;
    private EmployeeRepository repository;

    private EmployeeServiceImpl(){this.repository = EmployeeRepositoryImpl.getInstance();
    }
    public static EmployeeServiceImpl getService(){
        if(service==null)service = new EmployeeServiceImpl();
        return service;
    }

    @Override
    public Set<Employee> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Employee create(Employee employee) {
        return this.repository.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return this.repository.update(employee);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Employee read(String s) {
        return this.repository.read(s);
    }
}
