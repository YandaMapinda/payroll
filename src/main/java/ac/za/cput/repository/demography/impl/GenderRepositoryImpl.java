package ac.za.cput.repository.demography.impl;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.repository.demography.GenderRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GenderRepositoryImpl implements GenderRepository {

    private static GenderRepositoryImpl repository = null;
    private Map<String, Gender> genderMap;

    private GenderRepositoryImpl(){genderMap = new HashMap<String, Gender>();
    }
    public static GenderRepositoryImpl getInstance(){
        if(repository==null)repository = new GenderRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Gender> getAll() {
        return null;
    }

    @Override
    public Gender create(Gender gender) {
        genderMap.put(gender.getId(),gender);
        Gender gender1 = genderMap.get(gender.getId());
        return gender1;
    }

    @Override
    public Gender update(Gender gender) {
        genderMap.put(gender.getId(),gender);
        Gender gender1n= genderMap.get(gender.getId());
        return gender1n;
    }

    @Override
    public void delete(String s) {
        genderMap.remove(s);
    }

    @Override
    public Gender read(String s) {
        Gender gender = genderMap.get(s);
        return gender;
    }
}
