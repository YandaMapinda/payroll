package ac.za.cput.repository.demography.impl;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.factory.demography.GenderFactory;
import ac.za.cput.repository.demography.GenderRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderRepositoryImplTest {
    private GenderRepository repository;
    private Gender gender;

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.getInstance();
        this.gender = GenderFactory.getGender("Male","Female");
    }

    @Test
    public void getAll() {
        Set<Gender> genders = this.repository.getAll();
    }

    @Test
    public void create() {
        Gender create = this.repository.create(this.gender);
        Assert.assertEquals("Female",create.getFemale());
    }

    @Test
    public void update() {
        Gender update = new Gender.Builder().female("Mogurl").build();
        this.repository.update(update);
        Assert.assertEquals("Mogurl",update.getFemale());
    }

    @Test
    public void delete() {
        this.repository.delete(gender.getFemale());
        getAll();
    }

    @Test
    public void read() {
        Gender read = this.repository.read(gender.getFemale());
        Assert.assertNull(gender.getFemale(),read);
    }
}