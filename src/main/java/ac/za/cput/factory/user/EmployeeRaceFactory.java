package ac.za.cput.factory.user;

import ac.za.cput.domain.user.EmployeeRace;

public class EmployeeRaceFactory {
    public static EmployeeRace getEmployeeRace(String black,String coloured,String white){
        return new EmployeeRace.Builder().black(black).coloured(coloured).white(white).build();
    }
}
