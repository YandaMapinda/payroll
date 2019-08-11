package ac.za.cput.service.user.impl;

import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.factory.user.EmployeeGenderFactory;
import ac.za.cput.repository.user.EmployeeGenderRepository;
import ac.za.cput.repository.user.impl.EmployeeGenderRepositoryImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeGenderServiceImplTest {

    private EmployeeGenderRepositoryImpl repository;
    private EmployeeGender gender;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeGenderRepositoryImpl.getInstance();
        this.gender = EmployeeGenderFactory.getEmployeeGender("Male","Female");
    }

    @Test
    public void getAll() {
        Set<EmployeeGender> genders = this.repository.getAll();
    }

    @Test
    public void create() {
        EmployeeGender create = this.repository.create(this.gender);
        Assert.assertEquals("Female",create.getFemale());
    }

    @Test
    public void update() {
        EmployeeGender update = new EmployeeGender.Builder().female("Mogurl").build();
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
        EmployeeGender read = this.repository.read(gender.getFemale());
        Assert.assertNull(gender.getFemale(),read);
    }
}