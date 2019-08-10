package ac.za.cput.repository.demography.impl;

import ac.za.cput.domain.demography.Race;
import ac.za.cput.factory.demography.RaceFactory;
import ac.za.cput.repository.demography.RaceRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceRepositoryImplTest {

    private RaceRepository repository;
    private Race race;

    @Before
    public void setUp() throws Exception {
        this.repository = RaceRepositoryImpl.getInstance();
        this.race = RaceFactory.getRace("black","coloured","white");
    }

    @Test
    public void getAll() {
        Set<Race> races = this.repository.getAll();

    }

    @Test
    public void create() {
        Race create = this.repository.create(this.race);
        Assert.assertNotNull(create);
    }

    @Test
    public void update() {
        Race update = new Race.Builder().black("Ntsundu").build();
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
        Race read = this.repository.read(race.getBlack());
        Assert.assertNotEquals(read,race.getBlack());
    }
}