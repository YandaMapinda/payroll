package ac.za.cput.service.user.impl;

import ac.za.cput.domain.user.EmployeeRace;
import ac.za.cput.repository.user.EmployeeRaceRepository;
import ac.za.cput.repository.user.impl.EmployeeRaceRepositoryImpl;
import ac.za.cput.service.user.EmployeeRaceService;

import java.util.Set;

public class EmployeeRaceServiceImpl implements EmployeeRaceService {

    private static EmployeeRaceServiceImpl service = null;
    private EmployeeRaceRepository repository;

    private EmployeeRaceServiceImpl(){this.repository = EmployeeRaceRepositoryImpl.getInstance();
    }
    public static EmployeeRaceServiceImpl getService(){
        if(service==null)service = new EmployeeRaceServiceImpl();
        return service;
    }

    @Override
    public Set<EmployeeRace> getAll() {
        return this.repository.getAll();
    }

    @Override
    public EmployeeRace create(EmployeeRace employeeRace) {
        return this.repository.create(employeeRace);
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace) {
        return this.repository.update(employeeRace);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public EmployeeRace read(String s) {
        return this.repository.read(s);
    }
}
