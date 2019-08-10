package ac.za.cput.factory.demography;

import ac.za.cput.domain.demography.Gender;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenderFactoryTest {
    private String male,female;

    @Before
    public void setUp() throws Exception {
        this.female = "Girl";
        this.male = "Boy";
    }
    @Test
    public void getGender() {
        Gender gender = GenderFactory.getGender(this.male,this.female);
        Assert.assertEquals("The gender is","Girl",gender.getFemale());
    }
}
