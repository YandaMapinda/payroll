package ac.za.cput.factory.user;

import ac.za.cput.domain.user.EmployeeRace;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeRaceFactoryTest {
    private String black,white,coloured;
    @Before
    public void setUp() throws Exception {
        this.black = "black";
        this.coloured = "coloured";
        this.white = "mlungu";
    }

    @Test
    public void getEmployeeRace() {
        EmployeeRace race = EmployeeRaceFactory.getEmployeeRace(this.black,this.coloured,this.white);
        Assert.assertEquals("mlungu",race.getWhite());
        Assert.assertNotNull(race.getBlack(),race.getColoured());
    }


}
