package ac.za.cput.repository.demography.impl;

import ac.za.cput.domain.demography.Race;
import ac.za.cput.repository.IRepository;
import ac.za.cput.repository.demography.RaceRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RaceRepositoryImpl implements RaceRepository {

    private static RaceRepositoryImpl repository = null;

    private Map<String,Race> raceMap;

    private RaceRepositoryImpl(){raceMap= new HashMap<String, Race>();
    }
    public static RaceRepositoryImpl getInstance(){
        if(repository == null)repository = new RaceRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Race> getAll() {
        return null;
    }

    @Override
    public Race create(Race race) {
       raceMap.put(race.getId(),race);
       Race race1 = raceMap.get(race.getId());
        return race1;
    }

    @Override
    public Race update(Race race) {
        raceMap.put(race.getId(),race);
        Race race1 = raceMap.get(race.getId());
        return race1;
    }

    @Override
    public void delete(String s) {
        raceMap.remove(s);
    }

    @Override
    public Race read(String s) {
        Race race = raceMap.get(s);
        return race;
    }
}
