package ac.za.cput.factory.demography;

import ac.za.cput.domain.demography.Gender;
//import ac.za.cput.util.Misc;

public class GenderFactory {

    public static Gender getGender(String male,String female){
        return new Gender.Builder().female(female).male(male).build();
    }
}
