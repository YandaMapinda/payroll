package ac.za.cput.factory.demography;

import ac.za.cput.domain.demography.Race;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RaceFactoryTest {

    private String black,white,coloured;
    @Before
    public void setUp() throws Exception {
        this.black = "black";
        this.coloured = "coloured";
        this.white = "mlungu";
    }

    @Test
    public void getRace() {
        Race race = RaceFactory.getRace(this.black,this.coloured,this.white);
        Assert.assertEquals("mlungu",race.getWhite());
        Assert.assertNotNull(race.getBlack(),race.getColoured());
    }
}
