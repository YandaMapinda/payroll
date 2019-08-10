package ac.za.cput.factory.demography;

import ac.za.cput.domain.demography.Race;

public class RaceFactory {

    public static Race getRace(String black,String coloured,String white){
        return new Race.Builder().black(black).
                coloured(coloured).
                white(white).build();
    }
}
