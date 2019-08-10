package ac.za.cput.factory.user;

import ac.za.cput.domain.user.EmployeeGender;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeGenderFactoryTest {
    private String male,female;

    @Before
    public void setUp() throws Exception {
        this.female = "Girl";
        this.male = "Boy";
    }
    @Test
    public void getEmployeeGender() {
        EmployeeGender gender = EmployeeGenderFactory.getEmployeeGender(this.male,this.female);
        Assert.assertEquals("The gender is","Girl",gender.getFemale());
    }
}
