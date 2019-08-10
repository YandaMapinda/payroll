package ac.za.cput.repository.user.impl;

import ac.za.cput.domain.user.EmployeeRace;
import ac.za.cput.repository.user.EmployeeRaceRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeRaceRepositoryImpl implements EmployeeRaceRepository {

    private static EmployeeRaceRepositoryImpl repository = null;
    private Map<String,EmployeeRace>raceMap;

    private EmployeeRaceRepositoryImpl(){raceMap = new HashMap<String, EmployeeRace>();
    }
    public static EmployeeRaceRepositoryImpl getInstance(){
        if(repository==null)repository = new EmployeeRaceRepositoryImpl();
        return repository;
    }

    @Override
    public Set<EmployeeRace> getAll() {
        return null;
    }

    @Override
    public EmployeeRace create(EmployeeRace employeeRace) {
        raceMap.put(employeeRace.getId(),employeeRace);
        EmployeeRace race = raceMap.get(employeeRace.getId());
        return race;
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace) {
        raceMap.put(employeeRace.getId(),employeeRace);
        EmployeeRace race = raceMap.get(employeeRace.getId());
        return race;
    }

    @Override
    public void delete(String s) {
        raceMap.remove(s);
    }

    @Override
    public EmployeeRace read(String s) {
        EmployeeRace employeeRace = raceMap.get(s);
        return employeeRace;
    }
}
