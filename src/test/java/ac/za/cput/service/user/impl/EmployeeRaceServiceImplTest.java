package ac.za.cput.service.user.impl;

import ac.za.cput.domain.user.EmployeeRace;
import ac.za.cput.factory.user.EmployeeRaceFactory;
import ac.za.cput.repository.user.EmployeeRaceRepository;
import ac.za.cput.repository.user.impl.EmployeeRaceRepositoryImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeRaceServiceImplTest {

    private EmployeeRaceRepositoryImpl repository;
    private EmployeeRace race;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRaceRepositoryImpl.getInstance();
        this.race = EmployeeRaceFactory.getEmployeeRace("black","coloured","white");
    }

    @Test
    public void getAll() {
        Set<EmployeeRace> races = this.repository.getAll();

    }

    @Test
    public void create() {
        EmployeeRace create = this.repository.create(this.race);
        Assert.assertNotNull(create);
    }

    @Test
    public void update() {
        EmployeeRace update = new EmployeeRace.Builder().black("Ntsundu").build();
        this.repository.update(update);
        Assert.assertEquals("Ntsundu",update.getBlack());
    }

    @Test
    public void delete() {
        this.repository.delete(race.getBlack());
        getAll();
    }

    @Test
    public void read() {
        EmployeeRace read = this.repository.read(race.getBlack());
        Assert.assertNotEquals(read,race.getBlack());
    }
}