package ac.za.cput.repository.user.impl;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.repository.user.EmployeeRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    private Map<String,Employee>employeeMap;

    private EmployeeRepositoryImpl(){employeeMap = new HashMap<String, Employee>();
    }
    public static EmployeeRepositoryImpl getInstance(){
        if(repository == null)repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Employee> getAll() {
        return null;
    }

    @Override
    public Employee create(Employee employee) {
        employeeMap.put(employee.getEmpNum(),employee);
        Employee employee1 = employeeMap.get(employee.getEmpNum());
        return employee1;
    }

    @Override
    public Employee update(Employee employee) {
        employeeMap.put(employee.getEmpNum(),employee);
        Employee employee1 = employeeMap.get(employee.getEmpNum());
        return employee1;
    }

    @Override
    public void delete(String s) {
        employeeMap.remove(s);
    }

    @Override
    public Employee read(String s) {
        Employee employee = employeeMap.get(s);
        return employee;
    }
}
