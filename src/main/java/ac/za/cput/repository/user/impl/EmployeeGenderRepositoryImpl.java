package ac.za.cput.repository.user.impl;

import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.repository.user.EmployeeGenderRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeGenderRepositoryImpl implements EmployeeGenderRepository {

    private static EmployeeGenderRepositoryImpl repository = null;
    private Map<String, EmployeeGender> employeeGenderMap;

    private EmployeeGenderRepositoryImpl(){employeeGenderMap = new HashMap<String, EmployeeGender>();
    }
    public static EmployeeGenderRepositoryImpl getInstance(){
        if(repository ==null)repository = new EmployeeGenderRepositoryImpl();
        return repository;
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return null;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        employeeGenderMap.put(employeeGender.getId(),employeeGender);
        EmployeeGender employeeGender1 = employeeGenderMap.get(employeeGender.getId());
        return employeeGender1;
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        employeeGenderMap.put(employeeGender.getId(),employeeGender);
        EmployeeGender employeeGender1 = employeeGenderMap.get(employeeGender.getId());
        return employeeGender1;
    }

    @Override
    public void delete(String s) {
        employeeGenderMap.remove(s);
    }

    @Override
    public EmployeeGender read(String s) {
        EmployeeGender employeeGender = employeeGenderMap.get(s);
        return employeeGender;
    }
}
